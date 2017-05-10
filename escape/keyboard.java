import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.awt.*;
import javax.swing.ImageIcon;


public class keyboard
{
	//public static final int SPEED = 2;

	private int dx, //velocity x
				dy, //velocity y
				x,  //x position
				y;  //y position

	private Image sprite;

	public keyboard()
	{
		//ImageIcon image = new ImageIcon("xxxx.jpg");
		//sprite = image.getImage();
		x = 0;
		y = 750;

	}

	/**
	* changes the coordinates of the sprite
	*/
	public void move()
	{
		x += dx;
		y += dy;

	} //end of move

	public int getX()
	{
		return x;
	} //end of getX

	public int getY()
	{
		return y;
	} //end of getY

	public Image getImage()
	{
		return sprite;
	} //end of getImage

	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT)
		{
			dx = -1;
		}
		if (key == KeyEvent.VK_RIGHT)
		{
			dx = 1;
		}
		if (key == KeyEvent.VK_UP)
		{
			dy = -1;
		}
		if (key == KeyEvent.VK_DOWN)
		{
			dy = 1;
		}

	} //end of keyPressed


	public void keyReleased(KeyEvent e)
	{

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT)
		{
			dx = 0;
		}
		if (key == KeyEvent.VK_RIGHT)
		{
			dx = 0;
		}
		if (key == KeyEvent.VK_UP)
		{
			dy = 0;
		}
		if (key == KeyEvent.VK_DOWN)
		{
			dy = 0;
		}

	} //end of keyReleased



}// end of keyboard class