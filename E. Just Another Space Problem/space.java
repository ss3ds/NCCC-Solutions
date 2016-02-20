import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author saleem
 */
public class space {
	
	static ArrayList<String[]> possibilities = new ArrayList<>();
	
	public static String[] permutation(String str)
	{
		String st = permutation("", str);
		s = "";
		String[] stArr = st.substring(0, st.length()-1).split(" ");
		Set<String> mySet = new HashSet<String>(Arrays.asList(stArr));
		String[] stArr2 = mySet.toArray(new String [mySet.size()]);
		return stArr2;
	}
	
	static String s = "";

	private static String permutation(String prefix, String str)
	{
		int n = str.length();
		if (n == 0)
		{
			s+= prefix+" ";
		}
		else
		{
			for (int i = 0; i < n; i++)
			{
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}
		return s;
	}
	
	public static String space()
	{
		String out = "";
		Scanner in = null;
		
		try
		{
			in = new Scanner(new File("space.in"));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

		// reading data set from the file and processing
		in.nextLine();
		while (in.hasNextLine())
		{
			int sum=0;
			in.nextLine();
			String[] asteroids = in.nextLine().trim().split(" ");
			
			for (String s: asteroids)
			{
				possibilities.add(permutation(s));
			}
			
			for (int i = 0; i < possibilities.size()-1; i++)
			{
				String[] per1 = possibilities.get(i);
				int contin = 0;
				for (int j = i+1; j < possibilities.size(); j++)
				{
					String[] per2 = possibilities.get(j);
					loop:
					for (int k = contin; k < per1.length; k++)
					{
						for (int l = 0; l < per2.length; l++)
						{
							int num1 = Integer.parseInt(per1[k]);
							int num2 = Integer.parseInt(per2[l]);
							if (num1 == num2)
							{
								contin++;
								sum++;
								break loop;
							}
						}
					}
				}
			}
			out += sum + "\n";
			possibilities.clear();
		}
		in.close();
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(space());
	}
}

