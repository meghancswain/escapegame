//Meghan Swain
//traffic
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class traffic
{
	//my list of car objects
	private ArrayList<car> myCars;

	public traffic()
	{
		//so, make a traffic object in the beginning of main and it will automatically start with 1 car
		myCars = new ArrayList<car>();
		myCars.add(new car());
	}

	//returns a list with each car object
	public ArrayList<car> getTrafficList()
	{
		return myCars;
	}

	//adds a car each time main levels up and calls this method
	public void addCar()
	{
		myCars.add(new car());
	}

}//ends traffic