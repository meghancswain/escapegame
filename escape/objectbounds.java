import java.awt.Rectangle;
import java.awt.Image;

public class objectbounds
{
	private Rectangle bounds;

	public int x, y;

	private Image image;

	private int height, width;

	/*
	* sets the image and coordinates
	* creates a rectangle
	*/
	public objectbounds(Image img, int startX, int startY)
	{
		image = img;

		x = startX;
		y = startY;

		width = image.getWidth();
		height = image.getHeight();

		bounds = new Rectangle(x, y, width, height);

	}//end of constructor

	/**
	* returns the bounds of the rectangle
	*/
	public Rectangle getBounds()
	{
		bounds.x = x;
		bounds.y = y;


		return bounds;
	}//end of Rectangle

}//end of class