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
	int positionX;
	int positionY;
	int direction;	//-1 is left, 1 is right
	int carSizeX;
	int carSizeY;
	ImageIcon carImage;

	public car()  //(400-1100) x 1500 grid
	{
		//generates the direction the car will be going in the beginning
		if (Math.random()*2 == 1)
			direction = -1;
		else
			direction = 1;

		carImage = new ImageIcon("images/carPNG");
		carSizeX = carImage.getIconHeight();
		carSizeY = carImage.getIconWidth();

		//gets the starting coords of the image   	based on top left
		positionX = (int)(Math.random() * (1501-carSizeX));		//doesn't go up to 1501 because image is carSize pixels wide
		positionY = (int)(Math.random() * (701-carSizeY) + 400);

	}// ends car constructor

	public void carForward(){
		if ((positionX + direction > -1) && (positionX + carSizeX + direction  < 1501))
			positionX += direction;
		else{
			direction *= -1;
			positionX += direction;}

	}//ends carForward

	public Image getCarImage(){
		return carImage.getImage();
	}

}//ends car class
