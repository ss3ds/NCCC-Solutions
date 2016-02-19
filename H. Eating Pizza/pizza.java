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
			double side = Math.sqrt(triangularArea / (Math.sqrt(3)/4));
			double radius = side/Math.sqrt(3);
			double circleArea = Math.PI * Math.pow(radius, 2);
			out+= df.format(circleArea) + "\n";
		}
		in.close();
		
		return out.trim();
	}
	
	public static void main(String[] args)
	{
		System.out.println(pizza());
	}
}
