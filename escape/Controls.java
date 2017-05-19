import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.*;
/**
 * Controls Class
 */
public class Controls extends JPanel implements ActionListener
{
    //need actionlistener interface to be able to move the character when a key is pressed
    // instance variables - replace the example below with your own
    private Timer timer;
    private character character;
    private int wait = 5;
    traffic street = new traffic();

    /**
     * Constructor for objects of class Controls
     */
    public Controls()
    {
        setFocusable(true);
        addKeyListener(new Adapter());
        character = new character();
        timer = new Timer(wait, this);
        timer.start();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    /*
    public void initControls()
    {

    }
    */
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        //draw(page);
        page.drawImage(character.getImage(), character.getX(), character.getY(), this);
        for (car vehicle: street.getTrafficList())
        {
            page.drawImage(vehicle.getCarImage(), vehicle.getXPos(), vehicle.getYPos(), this);
        }



    }

    /**
     * draw method to draw the image of the character
     */
    /*
    public void draw(Graphics page)
    {
       // Graphics2D page2D = (Graphics2D) page;
        page.drawImage(character.getImage, character.getX(), character.getY(), this);

    }

    */

   /**
    * When the user presses a certain key, the x and y values
    * of the character are changed and the character is redrawn
    */
    public void actionPerformed(ActionEvent event)
    {
        character.move();
        //repaint() calls paintComponent() and redraws the character
        //after it has been moved and the x and y locations have been changed

        //this is incorrect but is here for the sake of trying to move the cars in the first place
        for (car vehicle: street.getTrafficList()){
            vehicle.carForward();
        }
        repaint();
    }

    //this is an inner class
    //Keyadapter is an abstract class so Adapter implements the methods of the abstract class
        private class Adapter extends KeyAdapter{
            //override the keyadapter method with the child class and the keylistener methods of character
         public void keyPressed(KeyEvent event)
            {
            character.keyPressed(event);
        }

            public void KeyReleased (KeyEvent event){
            character.keyReleased(event);
        }
    }

}
