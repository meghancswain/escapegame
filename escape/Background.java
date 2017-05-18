import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 * Make the background a certain color that I choose
 * The background is just a filled rectangle because I need to change the rectangle color as the program runs
 * */
public class Background
{

public void paint(Graphics page) {

        Image pic = new Image("//images.Road");
        page.drawImage(pic.getImage(), 0, 0, null);
    }


}