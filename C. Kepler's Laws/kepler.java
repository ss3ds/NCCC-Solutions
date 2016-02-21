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
			String f = new String(first);
			String s = new String(second);
			boolean foundIn = false;
			boolean found = true;
			
			for (int i = 0; i < f.length(); i++)
			{
				foundIn = false;
				for (int j = 0; j < s.length(); j++)
				{
					if (f.charAt(i) == s.charAt(j))
					{
						foundIn = true;
						f = f.replace(f.charAt(i), '*');
						break;
					}
				}
				
				if (!foundIn)
				{
					found = false;
					break;
				}
			}
			
			if (found)
			{
				out += "YES\n";
				continue;
			}
			
			found = true;
			
			for (int i = 0; i < second.length(); i++)
			{
				foundIn = false;
				for (int j = 0; j < first.length(); j++)
				{
					if (second.charAt(i) == first.charAt(j))
					{
						foundIn = true;
						second = second.replace(second.charAt(i), '*');
						break;
					}
				}
				
				if (!foundIn)
				{
					found = false;
					break;
				}
			}
			
			if (found)
			{
				out += "YES\n";
				continue;
			}
			else
			{
				out += "NO\n";
				continue;
			}
		}
		in.close();
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(kepler());
	}
}
