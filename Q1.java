import java.lang.InterruptedException;
import java.lang.Thread;
import java.util.Random;

public class Q1
{
	public static void main(String[] args)
	{
		Bridge bridge = new Bridge();
		Random r = new Random();

		for(int i = 0; i < 6; i++)
		{
			Farmer farmer;
			if(r.nextBoolean())
			{
				farmer = new Farmer(bridge, "North");
			}
			else
			{
				farmer = new Farmer(bridge, "South");
			}
			
			cross(farmer);
		}
	}
	
	public static void cross(Farmer f)
	{
		new Thread(f).start();
	}
}