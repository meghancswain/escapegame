//Kathy Zhou

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Image;
import javax.swing.ImageIcon;


public class character
{
	private int dx, //change in x position
				dy, //change in y position
				x,  //x position
				y;  //y position

	private Image sprite;

	private int lives = 5;

	public character()
	{
		ImageIcon image = new ImageIcon("images\\molang.PNG");
		sprite = image.getImage();
		x = 50;
		y = 350;
	}

	/**
	* adds / updates lives of characters
	*/
	public void life(boolean death, boolean newlevel)
	{
		//if the user dies, take away a life
		if (death == true)
		{
			lives--;
		}

		//adds a life if it is a new level
		//adds only if the user does not already have 5 lives
		if (newlevel == true)
		{
			if (lives < 5)
			{
				lives++;
			}
		}

	}//end of life

	/**
	* returns the number of lives of the character
	*/
	public int getlife()
	{
		return lives;

	}//end of getlife


	/**
	* changes the coordinates of the sprite
	* the x and y values are sent to the PaintComponent to paint the sprite at the coordinates
	*/
	public void move()
	{
		//adds the change in x position to the current x position
		x += dx;
		//adds the change in y position to the current y position
		y += dy;

	} //end of move

	/*
	* returns the current x coordinate
	*/
	public int getX()
	{
		return x;
	} //end of getX

	/*
	* returns the current y position
	*/
	public int getY()
	{
		return y;
	} //end of getY

	/*
	* returns the sprite's image
	*/
	public Image getImage()
	{
		return sprite;
	} //end of getImage


	/**
	* senses when the keys are pressed
	* when the keys are pressed it changes the change in position to 1 to signify movement
	*/
	public void keyPressed(KeyEvent e)
	{
		//sets key to the value of the keycode received from the keyboard
		int key = e.getKeyCode();

		//if the keycode equals the left arrow key
		if (key == KeyEvent.VK_LEFT)
		{
			dx = -1;
		}

		//if the keycode is the right arrow key
		if (key == KeyEvent.VK_RIGHT)
		{
			dx = 1;
		}

		//if the keycode is the up arrow key
		if (key == KeyEvent.VK_UP)
		{
			dy = -1;
		}

		//if the keycode is the down arrow key
		if (key == KeyEvent.VK_DOWN)
		{
			dy = 1;
		}

	} //end of keyPressed


	/**
	* senses when the keys are released
	* when the keys are released, it changes the change in position to 0 to signify no movement
	*/
	public void keyReleased(KeyEvent e)
	{
		//sets key to the value of the keycode received from the keyboard
		int key = e.getKeyCode();

		//if the keycode equals the left arrow key
		if (key == KeyEvent.VK_LEFT)
		{
			dx = 0;
		}

		//if the keycode is the right arrow key
		if (key == KeyEvent.VK_RIGHT)
		{
			dx = 0;
		}

		//if the keycode is the up arrow key
		if (key == KeyEvent.VK_UP)
		{
			dy = 0;
		}

		//if the keycode is the down arrow key
		if (key == KeyEvent.VK_DOWN)
		{
			dy = 0;
		}


	} //end of keyReleased



}// end of character class