import java.lang.InterruptedException;
import java.util.concurrent.Semaphore;

public class Bridge
{
	private Semaphore s;
	
	public Bridge(){
		this.s = new Semaphore();
	}

	public void enter() throws InterruptedException
	{
		this.s.acquire();
	}
	public void leave()
	{
		this.s.release();
	}
}