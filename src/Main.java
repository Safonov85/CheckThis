import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.String;

public class Main
{
	// variables for PI decimals amount
	static double PI = Math.PI;
	static String decimals = "#.";
	
	// Fibonacci Sequence variables
	static int firstNum = 0;
	static int secondNum = 0;
	static int lastNum = 0;
	static int fiboAmount = 0;
	
	// Prime Factorization variables
	static int primeInput = 0;
	static double primeResult = 0;
	static boolean isPrime;

	
	public static void main(String[] args)
	{	
		CalculateStuff();
	}
	
	static void CalculateStuff()
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("How many decimals of PI: ");
		
		int amount = reader.nextInt();
		
		// adds the decimals("#") amount put in by the user to the variable
		int i = 0;
		while(i < amount)
		{
			decimals = decimals + "#";
			i++;
		}
		
		DecimalFormat decimalFormat = new DecimalFormat(decimals); // #.#### <--- 4 decimals
		
		System.out.println("PI decimals : " + decimalFormat.format(PI));
		System.out.println("");
		System.out.println("---- Fibonacci Sequence ----");
		System.out.print("Pls enter how many Fibonacci numbers you want: ");
		fiboAmount = reader.nextInt();
		
		for(int j = 0; j < fiboAmount; j++)
		{
			if(j < 2)
			{
				System.out.print(secondNum + ", ");
				secondNum = 1;
			}
			else
			{
				lastNum = firstNum + secondNum;
				System.out.print(lastNum + ", ");
				firstNum = secondNum;
				secondNum = lastNum;
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("---- Prime Factorization ----");
		System.out.print("Enter a number to see if it's Prime: ");
		primeInput = reader.nextInt();
		
		for(int ij = 1; ij < 10; ij++)
		{
			primeResult = primeInput / (double)ij;
			
			if((primeResult % 1) == 0 && primeResult != 1.0)
			{
				//System.out.println((int)primeResult);
				if(primeResult == primeInput)
				{
					System.out.println((int)primeResult);
					isPrime = true;
				}
				else
				{
					isPrime = false;
				}
			}
		}
		
		System.out.println(isPrime);
		
		reader.close();
	}
}
