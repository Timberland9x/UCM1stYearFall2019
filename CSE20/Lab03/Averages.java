import java.util.Scanner;

public class Averages
{
	public static void main(String[] args)
	{
		System.out.print("This program will ask the user for two numbers, ");
		System.out.println("and will calculate the average of those numbers.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.println("Please enter the first number:");
		n1 = input.nextInt();
		
		System.out.print("Please enter the second number:");
		n2 = input.nextInt();

		double average;
		average = (n1+n2)/2;
		System.out.print("The average of the numbers " + n1 + " and " + n2 + " is ");
		System.out.println(average);
	}
}