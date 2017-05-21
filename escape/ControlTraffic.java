import java.lang.*;
import java.awt.*;
import javax.swing.*;
/**
 * ControlTraffic class
 * Will be used to run its own thread to run the cars
 */
public class ControlTraffic extends JPanel implements Runnable{
    // instance variables - replace the example below with your own
   // traffic street;
   car vehicle;

    /**
     * Constructor for objects of class ControlTraffic
     */
    public ControlTraffic() 
    {
        
       vehicle = new car();
        //street = new traffic();
    }

    /**
     * paint component redraws the cars after they have been moved.
     */
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        //page.drawImage(vehicle.getCarImage(), vehicle.getXPos(), vehicle.getYPos(), this);
        /*
        for (car vehicle: street.getTrafficList())
        { 
            page.drawImage(vehicle.getCarImage(), vehicle.getXPos(), vehicle.getYPos(), this);
        }
        */
        
    }
  

    public void run()
    {
       //street.getTrafficList().get(0).carForward();
      vehicle.carForward();
        
        /*
        for (int i = 0; i< street.getTrafficList().size(); i++)
        {
            street.getTrafficList().get(i).carForward();
           // vehicle.carForward();
        }
        */
        /*
         for (car vehicle: street.getTrafficList())
        { 
            vehicle.carForward();
        }
         */
       repaint();
    }
    
    
}
