import java.util.Scanner;

class BasicCalculator
{
	public static void main(String args[])
	{
		Scanner diya = new Scanner(System.in);
		double fnum,snum,answer;

		System.out.println("Enter the first number: ");
		fnum = diya.nextDouble();

		System.out.println("Enter the second number: ");
		snum = diya.nextDouble();

		answer = fnum + snum;

		System.out.println(answer);
	}
}
		
