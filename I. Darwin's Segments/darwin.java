import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * it shows WRONG ANSWER with the judges machine
 * @author saleem
 */
public class darwin {

	public static String darwin()
	{
		String out="";
		Scanner in=null;
		try
		{
			in = new Scanner(new File("darwin.in"));
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		
		in.nextLine();
		while (in.hasNextLine())
		{
			ArrayList<int[]> queries = new ArrayList<>();
			int arrLength = Integer.parseInt(in.nextLine().trim());
			int[] arr = new int[arrLength];
			for (int i = 0; i < arrLength; i++)
			{
				arr[i] = in.nextInt();
			}
			in.nextLine();
			
			int queriesNum = Integer.parseInt(in.nextLine().trim());
			for (int i = 0; i < queriesNum; i++)
			{
				int[] t = new int[4];
				t[0] = in.nextInt();
				t[1] = in.nextInt();
				t[2] = in.nextInt();
				if (t[0] == 1)
				{
					t[3] = in.nextInt();
				}
				queries.add(t);
				in.nextLine();
			}
			
			for (int i = 0; i < queries.size(); i++)
			{
				int[] t = queries.get(i);
				if (t[0] == 0)
				{
					arr[t[1]-1] = t[2];
				}
				else
				{
					boolean found=false;
					for (int j = t[2]-1; j <= t[3]-1; j++)
					{
						if (arr[j] == t[1])
						{
							found = true;
							break;
						}
					}
					out += (found) ? "YES\n" : "NO\n";
				}
			}
		}
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(darwin());
	}
}
