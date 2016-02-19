import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * it shows WRONG ANSWER with the judges machine
 * @author saleem
 */
public class game
{
	public static String game()
	{
		ArrayList<long[]> testCases = new ArrayList<>();
		String out = "";
		Scanner in = null;
		
		try
		{
			in = new Scanner(new File("game.in"));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

		// reading data set from the file
		in.nextLine();
		while (in.hasNextLine())
		{
			long x = in.nextLong();
			long k = in.nextLong();
			testCases.add(new long[]{x, k});
			in.nextLine();
		}
		in.close();

		for (int i = 0; i < testCases.size(); i++)
		{
			long[] currentTestCase = testCases.get(i);
			long x = currentTestCase[0];
			long k = currentTestCase[1];
			int sum = 0, counter = 0;
			
			for (long currentX=x+1; true; currentX++)
			{
				long n = currentX;
				while (n > 0)
				{
					sum += n % 10;
					n /= 10;
				}

				if (sum == 9)
				{
					counter++;
					if (counter == k)
					{
						out += currentX + "\n";
						break;
					}
				}
				sum = 0;
			}
		}
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(game());
	}
}
