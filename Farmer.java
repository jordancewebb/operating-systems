import java.lang.InterruptedException;
import java.util.Random;

public class Farmer implements Runnable
{
	private Bridge bridge;
	private Random random;
	String direction;

	public Farmer(Bridge b)
	{
		this.bridge = b;
		this.random = new Random();
	}

	public Farmer(Bridge b, String d)
	{
		this.bridge = b;
		this.random = new Random();
		this.direction = d;
	}

	public void crossBridge(Bridge bridge)
	{
		try
		{
			bridge.enter();
			Thread.sleep(1000 + random.nextInt(9000));
		}
		catch(Exception e)
		{
			System.out.println("Error:" + e.message);
			System.out.println("Stack trace:" + e.StackTrace);
		}
		finally
		{
			bridge.leave();
		}
	}

	public void run()
	{
		this.crossBridge(this.bridge);
	}
}