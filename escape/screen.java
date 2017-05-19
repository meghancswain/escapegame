//Meghan Swain
//title and end screen
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class screen
{
	private JPanel myPanel;
    private ImageIcon opening = new ImageIcon("images/open.JPEG");
    private ImageIcon closing = new ImageIcon("images/close.JPEG");

	public screen(JPanel theirPanel)
	{
		myPanel = theirPanel;

	}//ends constructor

    public void displayTitle(Graphics g)
    {
        g.drawImage(opening.getImage(), 0, 0, myPanel);
    }

    public void displayGameOver(Graphics g)
    {
        g.drawImage(closing.getImage(), 0, 0, myPanel);
    }


 //   @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.drawImage(image, 0, 0, this);





}//ends screen