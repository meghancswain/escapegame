//Meghan Swain
//cars

//imports
import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

//makes each car object
public class car
{
	int positionX; //top left corner
	int positionY;
	int direction;	//-1 is left, 1 is right
	int carSizeX; //aka width
	int carSizeY; //aka height
	ImageIcon carImage;

	public car()  //(100-600) x 700 grid
	{
		//generates the direction the car will be going in the beginning
		if (Math.random()*2 == 1)
			direction = -1;
		else
			direction = 1;

		//every car matches this same image
		carImage = new ImageIcon("images/car.PNG");
		carSizeX = carImage.getIconHeight();
		carSizeY = carImage.getIconWidth();

		//gets the starting coords of the image   	(based on top left)
		positionX = (int)(Math.random() * (701-carSizeX));		//doesn't go up to 701 because image is carSize pixels wide
		positionY = (int)(Math.random() * (501-carSizeY) + 100);

	}// ends car constructor

	//moves the car forward. will turn it around if it hits the border
	public void carForward(){
		if ((positionX + direction > -1) && (positionX + carSizeX + direction  < 701))
			positionX += direction;
		else{
			direction *= -1;
			positionX += direction;}

	}//ends carForward

	//returns the image for the car (png)
	public Image getCarImage(){
		return carImage.getImage();
	}

	//returns x cord of location
	public int getXPos(){
		return positionX;
	}

	//returns y cord of location
	public int getYPos(){
		return positionY;
	}

}//ends car class
