import java.io.File;
import java.util.Scanner;

/**
 *
 * @author saleem
 */
public class cubes {

	public static String cubes()
	{
		String out = "";
		Scanner in = null;
		
		try
		{
			in = new Scanner(new File("cubes.in"));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

		// reading data set from the file and processing
		in.nextLine();
		while (in.hasNextLine())
		{
			int x = in.nextInt();
			int y = in.nextInt();
			if (x < y)
				out+= "YES\n";
			else
				out+= "NO\n";
			in.nextLine();
		}
		in.close();
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(cubes());
	}
}