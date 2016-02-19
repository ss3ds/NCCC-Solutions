import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * it shows WRONG ANSWER with the judges machine
 * @author saleem
 */
public class future {


	public static String future()
	{
		String out ="";
		Scanner in=null;
		try
		{
			in = new Scanner(new File("future.in"));
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		
		in.nextLine();
		while (in.hasNextLine())
		{
			int loop = in.nextInt();
			int[] toPay = new int[loop];
			int[] paid = new int[loop];
			
			int sum = 0;
			in.nextLine();
			
			for (int i = 0; i < loop; i++)
			{
				toPay[i] = in.nextInt();
			}
			in.nextLine();
			
			for (int i = 0; i < loop; i++)
			{
				paid[i] = in.nextInt();
			}
			in.nextLine();
			
			for (int i = 0; i < loop; i++)
			{
				sum += paid[i] - toPay[i];
			}
			
			out += sum+"\n";
		}
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(future());
	}
}
