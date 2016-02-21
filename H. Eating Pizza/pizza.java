import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author saleem
 */
public class pizza {

	public static String pizza()
	{
		String out = "";
		Scanner in = null;
		DecimalFormat df = new DecimalFormat(".######");
		
		try
		{
			in = new Scanner(new File("pizza.in"));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

		// reading data set from the file and processing
		in.nextLine();
		while (in.hasNextLine())
		{
			int triangularArea = Integer.parseInt(in.nextLine().trim());
			double sqrtOf3 = Math.sqrt(3);
			double side = Math.sqrt(triangularArea / (sqrtOf3/4));
			double radius = side/sqrtOf3;
			double circleArea = Math.PI * Math.pow(radius, 2);
			System.out.println(df.format(circleArea));
		}
		in.close();
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		pizza();
	}
}
