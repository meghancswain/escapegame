//Meghan Swain
//river

//imports
import java.lang.*;
import java.util.*;

//Generates a hippo at the right/left side of the screen, and then moves them across
public class river
{
	int row = null;

	public river(row)
	{

		Pixel sourcePixel = null;
   	   	Pixel targetPixel = null;

	   for (int sourceX = 0, targetX = x; sourceX < sourcefile.getWidth(); sourceX++, targetX++)		//starts target were the user wants it to be located
	   {
		   for(int sourceY = 0, targetY = y; sourceY < sourcefile.getHeight(); sourceY++, targetY++)
		   {



				//set the target pixel color to the source pixel color
				sourcePixel = sourcefile.getPixel(sourceX,sourceY);
				targetPixel = this.getPixel(targetX,targetY);
				targetPixel.setColor(sourcePixel.getColor());
			}//row loop

	   }//col loop

	}//end of copyTo

	}


}//ends hippos
