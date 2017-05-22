//main part 2
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;


public class main2 extends Applet
{
    //constants for window size
    private final int APPLET_WIDTH = 700;
    private final int APPLET_HEIGHT = 700;

    //DOUBLE BUFFERING - Variables
    private Image i;
    private Graphics doubleG;
    int myPixelCount, myflag;


    public void init()
    {
        setSize (APPLET_WIDTH, APPLET_HEIGHT);    //set up applet window
        myPixelCount = 0;
        myflag = 1;
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
		ImageIcon road = new ImageIcon("image//Road.PNG");
		page.drawImage(road.getImage(),0,0,null);




        try {
            Thread.sleep(17);   //pauses for x milliseconds
        }
        catch(InterruptedException e){}


        repaint();   //calls paint and allows for animation, essentially makes this paint method an infinite loop

    }




}
/*





JFrame frame = new JFrame();
		frame.setSize(700,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Crossy Avenuez");
        frame.setLocationRelativeTo(null);

		ImageIcon road = new ImageIcon("image\\Road.JPEG");
        JLabel imageLabel = new JLabel(road);
        frame.add(imageLabel);

		frame.setVisible(true);


















	public static void main(String[] args){
		new main2();}


/*
	//Graphics myGraphic = new Graphics();


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
		ImageIcon road = new ImageIcon("image\\Road.PNG");
		page.drawImage(road.getImage(),0, 0,null);







        //try {
        //    Thread.sleep(17);   //pauses for x milliseconds
        //}
        //catch(InterruptedException e){}


        repaint();   //calls paint and allows for animation, essentially makes this paint method an infinite loop

       }




}
*/