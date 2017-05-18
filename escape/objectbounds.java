//Kathy Zhou

import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class objectbounds
{
	//creates a rectangle called bounds
	private Rectangle bounds;

	//x,y coordinates
	public int x, y;

	//creates an ImageIcon
	private ImageIcon sprite;

	//creates height and width
	private int height, width;

	/*
	* sets the image and coordinates
	* creates a rectangle
	*/
	public objectbounds(ImageIcon img, int startX, int startY)
	{
		//sets sprite to the image passed in
		sprite = img;

		//sets the coordinates to the coordiantes of the object
		x = startX;
		y = startY;

		//sets width and height to those of the icon
		width = sprite.getIconWidth();
		height = sprite.getIconHeight();

		//creates bounds based on the width and height and coordinates of the sprite
		bounds = new Rectangle(x, y, width, height);

	}//end of constructor

	/**
	* returns the bounds of the rectangle
	*/
	public Rectangle getBounds()
	{
		//finds the bounds of the rectangle
		bounds.x = x;
		bounds.y = y;


		return bounds;
	}//end of Rectangle

}//end of class