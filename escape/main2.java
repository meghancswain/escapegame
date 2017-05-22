//main part 2
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;



public class main2 extends JFrame{
/*
	//Graphics myGraphic = new Graphics();

	public static void main(String[] args){
		new main2();
		}


	public main2() {
		this.setVisible(true);
		this.setLocationRelativeTo(null);		//will center the JFrame
		this.setSize(700,700);
		this.setResizable(false);		//make it so they can’t change window size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Crossy Aveneuz");


		//(The panel object -  a panel surrounds the components and is in the frame)
		JPanel thePanel = new JPanel();

*/

/**
 * Meghan Swain
 * 1/20/17
 * Software Engineering Challenge
 * Runs all the methods and creates the image
 */


    //constants for window size
    private final int APPLET_WIDTH = 700;
    private final int APPLET_HEIGHT = 700;


    //DOUBLE BUFFERING - Variables
    private Image i;
    private Graphics doubleG;


    //Random generator =  new Random();

    //instantiates my buildings


    public void init()
    {

    }


    //DOUBLE BUFFERING - Method

    public void update(Graphics g){

        //creates an image if there isn't one
        if (i == null){
            i = createImage(APPLET_WIDTH,APPLET_HEIGHT);

            doubleG = i.getGraphics();
        }

        //doubleG.setColor(getBackground());    //i don't use a background color

        doubleG.fillRect(0,0,APPLET_WIDTH,APPLET_HEIGHT);   //makes the image it is drawn on

        paint(doubleG);  //paints to that image

        g.drawImage(i, 0, 0, this);  //draws the image on the official thing

    }

    public void paint (Graphics page)
       {
		Image road = new Image("image/Road.PNG");
		page.drawImage(Image img,int x, int y,ImageObserver observer);


        //draws a black rectangle for a road
        page.setColor(Color.BLACK);
        page.fillRect(0, APPLET_HEIGHT - 150, APPLET_WIDTH, 100);

        //white lane seperators. For loop allows me to make them dashes
        page.setColor(Color.WHITE);
        for (int dash = 0; dash * 30 <= APPLET_WIDTH + 1; dash++)
        {
            page.fillRect(0 + 30*dash, APPLET_HEIGHT - 126, 20, 3); //makes each dash 20 long, 3 high
            page.fillRect(0 + 30*dash, APPLET_HEIGHT - 74, 20, 3);

        }


        //yellow center lines
        page.setColor(Color.YELLOW);
        page.fillRect(0, APPLET_HEIGHT - 104, APPLET_WIDTH, 2);  //two yellow lines one on top of other
        page.fillRect(0, APPLET_HEIGHT - 98, APPLET_WIDTH, 2);


        //draws the sky. Count is to see how many pixels we have passed
        mySky.draw(page, myPixelCount, myflag);
        myPixelCount++;
        if (myPixelCount == APPLET_WIDTH +100){
            myPixelCount = 0;
            myflag *= -1;
        }

        //adds all of the bulidings to the screen
        b1.draw (page);
        b2.draw (page);
        b3.draw (page);
        b4.draw (page);
        b5.draw (page);
        b6.draw (page);
        b7.draw (page);
        b8.draw (page);
        b9.draw (page);
        b10.draw (page);


        try {
            Thread.sleep(17);   //pauses for x milliseconds
        }
        catch(InterruptedException e){}


        repaint();   //calls paint and allows for animation, essentially makes this paint method an infinite loop

       }




}
