import java.io.File;
import java.util.Scanner;

/**
 *
 * @author saleem
 */
public class pool {

	public static String pool()
	{
		String out = "";
		Scanner in = null;
		
		try
		{
			in = new Scanner(new File("pool.in"));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

		// reading data set from the file and processing
		in.nextLine();
		while (in.hasNextLine())
		{
			int volume = Integer.parseInt(in.nextLine().trim());
			out += (int) Math.cbrt(volume) * 4 * 3 + "\n";
		}
		in.close();
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(pool());
	}
}