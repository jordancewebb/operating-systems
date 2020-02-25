import java.io.*;
import java.net.*;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
				Socket sock = new Socket("localhost", 2000);
				InputStream in = sock.getInputStream();
				PrintWriter PW = new PrintWriter(sock.getOutputStream(), true);
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));
				BufferedReader SystemReader = new BufferedReader(new InputStreamReader(System.in));
				String line;
				do
				{
						line = reader.readLine();
						if(line != null)
						{
							System.out.println(line);	
						}
						line = SystemReader.readLine();
						PW.println(line);
				}
				while(!line.trim().equalsIgnoreCase("exit"));
				
		}
		catch(IOException IOE)
		{
				System.err.println(IOE);
		}
	}
}
