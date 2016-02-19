import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author saleem
 */
public class planet {


	public static String planet()
	{
		String out = "";
		Scanner in = null;
		
		try
		{
			in = new Scanner(new File("planet.in"));
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
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
			{
				arr[i] = in.nextInt();
			}
			in.nextLine();
			
			double median=0;
			ArrayList<Integer> arr2 = new ArrayList<>();
			for (int i = 0; i < arr.length; i++)
			{
				arr2.add(arr[i]);
				Collections.sort(arr2);
				int size = arr2.size();
				if (size % 2 == 0)
				{
					median = (arr2.get(size/2) + arr2.get(size/2 - 1))/2;
				}
				else
				{
					median = arr2.get((size-1) / 2);
				}

				if (arr[i] == median)
					out += "mid\n";
				else if (arr[i] < median)
					out += "down\n";
				else
					out += "up\n";
			}
		}
		in.close();
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(planet());
	}
}
