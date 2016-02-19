import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * it shows WRONG ANSWER with the judges machine
 * @author saleem
 */
public class donald {

	public static String donald()
	{
		String out = "";
		Scanner in = null;
		
		try
		{
			in = new Scanner(new File("donald.in"));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

		// reading data set from the file and processing
		in.nextLine();
		while (in.hasNextLine())
		{
			ArrayList<Integer> odd = new ArrayList<>();
			ArrayList<Integer> even = new ArrayList<>();
			int n = Integer.parseInt(in.nextLine().trim());
			for (int i = 0; i < n; i++)
			{
				int element = in.nextInt();
				
				if (element % 2 == 0)
					even.add(element);
				else
					odd.add(element);
			}
				
			Collections.sort(odd);
			Collections.sort(even);

			for (int j = 0; j < odd.size(); j++)
			{
				out += odd.get(j) + " ";
			}

			for (int k = 0; k < even.size(); k++)
			{
				out += even.get(k) + " ";
			}
			
			in.nextLine();
		}
		in.close();
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(donald());
	}
}