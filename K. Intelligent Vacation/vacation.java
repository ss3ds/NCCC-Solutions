import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author saleem
 */
public class vacation {


	public static String vacation()
	{
		String out ="";
		Scanner in=null;
		try
		{
			in = new Scanner(new File("vacation.in"));
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		
		in.nextLine();
		while (in.hasNextLine())
		{
			int c = in.nextInt();
			int d = in.nextInt();
			int cTimes = 0;
			int dTimes = 0;
			
			for (int i = 0; i < c; i++)
			{
				int a = in.nextInt();
				int b = in.nextInt();
				cTimes += b-a;
				in.nextLine();
			}
			
			for (int i = 0; i < d; i++)
			{
				int a = in.nextInt();
				int b = in.nextInt();
				dTimes += b-a;
				in.nextLine();
			}
			
			if (cTimes > dTimes)
			{
				out += "Marie C.\n";
			}
			else if (dTimes > cTimes)
			{
				out += "Charles D.\n";
			}
			else
			{
				if (c > d)
				{
					out += "Marie C.\n";
				}
				else if (d > c)
				{
					out += "Charles D.\n";
				}
				else
				{
					out += "Both\n";
				}
			}
		}
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(vacation());
	}
}
