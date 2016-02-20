import java.io.File;
import java.util.Scanner;

/**
 *
 * @author saleem
 */
public class kepler {

	public static String kepler()
	{
		String out = "";
		Scanner in = null;
		
		try
		{
			in = new Scanner(new File("kepler.in"));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

		// reading data set from the file and processing
		in.nextLine();
		while (in.hasNextLine())
		{
			String first = in.nextLine().trim();
			String second = in.nextLine().trim();
			boolean[] found1stArr = new boolean[first.length()];
			boolean[] found2ndArr = new boolean[second.length()];
			for (int j = 0; j < first.length(); j++)
			{
				for (int k = 0; k < second.length(); k++)
				{
					if (first.charAt(j) == second.charAt(k))
					{
						found1stArr[j] = true;
						found2ndArr[k] = true;
					}
				}
			}
			
			boolean found1 = true;
			boolean found2 = true;
			for (boolean x: found1stArr)
			{
				found1 = found1 & x;
			}
			for (boolean x: found2ndArr)
			{
				found2 = found2 & x;
			}
			
			if (found1 || found2)
				out += "YES\n";
			else
				out += "NO\n";
		}
		in.close();
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(kepler());
	}
}

