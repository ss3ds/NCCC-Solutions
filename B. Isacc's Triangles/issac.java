import java.io.File;
import java.util.Scanner;

/**
 *
 * @author saleem
 */
public class issac {

	public static String issac()
	{
		String out = "";
		Scanner in = null;
		
		try
		{
			in = new Scanner(new File("issac.in"));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

		// reading data set from the file and processing
		in.nextLine();
		while (in.hasNextLine())
		{
			int n = Integer.parseInt(in.nextLine().trim());
			
			out += ((n*(n-1)*(n-2)) / 6)+"\n";
		}
		in.close();
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(issac());
	}
}