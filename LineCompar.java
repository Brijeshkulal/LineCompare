import java.util.Scanner;
public class LineCompar 
{
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		double x1, x2, y1, y2, lengthOfLine;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the point x1: ");
		x1 = in.nextDouble();
		System.out.println("enter the point x2: ");
		x2 = in.nextDouble();
		System.out.println("enter the point y1: ");
		y1 = in.nextDouble();
		System.out.println("enter the point y2: ");
		y2 = in.nextDouble();
		lengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of the line: " + lengthOfLine);
	}
}
