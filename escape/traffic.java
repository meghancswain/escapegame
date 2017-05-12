//Meghan Swain
//traffic
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class traffic
{
	private ArrayList<car> myCars;

	public traffic()
	{
		myCars = new ArrayList<car>();
	}
	public ArrayList<car> trafficList(int level)
	{
		for(int i = 0; i < level; i++)
			myCars.add(new car());

		return myCars;
	}

}//ends traffic