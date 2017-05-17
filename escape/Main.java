//main class to run applet

import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Main extends Applet
{

public static void main(String[]args)
{

	APPLET_WIDTH = 700;
	APPLET_HEIGHT = 700;

	setSize (APPLET_WIDTH, APPLET_HEIGHT);


	Background background = new Background();

	background.drawBackground();




}


}