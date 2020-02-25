import java.io.*;
import java.net.*;

public class Server
{
		public static void main(String[] args)
		{
			try
			{
				ServerSocket sock = new ServerSocket(2000);
				while(true)
				{
					Socket cli = sock.accept();
					BufferedReader reader = new BufferedReader(new InputStreamReader(cli.getInputStream()));
					PrintWriter PW = new PrintWriter(cli.getOutputStream(), true);
					PW.println("Echo Server: Type 'exit' to quit");
					String line;
					do
					{
						line = reader.readLine();
						System.out.println(line);
						if(line != null)
						{
								PW.println(line);
						}
					}
					while(!line.trim().equalsIgnoreCase("exit"));
					cli.close();
				}
			}
			catch(IOException IOE)
			{
					System.err.println(IOE);
			}
				
		}
}
