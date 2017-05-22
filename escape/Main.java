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

}
public void paint(Graphics page) {

        Image pic = new Image("//images.Road");
        page.drawImage(pic.getImage(), 0, 0, null);
    }

	//Background background = new Background();

	//background.drawBackground();


traffic street = new traffic();


street.add();



}


}