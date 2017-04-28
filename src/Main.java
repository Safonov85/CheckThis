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
	
	// Cost of Tile Variables
	static double squareInput;
	static double tileCost = 200;
	static double costResult;
	
	// Monthly payments mortgage Variables
	static double paymentPerMonth = 0;
	static double interestYear = 0;
	static double interestMonth = 0;
	static double amountLoan = 0;
	static int years = 0;
	
	// Change Return Program
	static double cost = 0;
	static double myMoney = 0;
	static double moneyReturn = 0;
	
	// Decimal/Binary Variables
	static int decimal = 0;
	
	// Calculator Variables
	static String operator;
	static double firstNumber;
	static double secondNumber;
	static double resultNumber;

	
	public static void main(String[] args)
	{	
		CalculateStuff();
	}
	
	static void CalculateStuff()
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("");
		System.out.println("---- PI Decimal Places ----");
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
		
		System.out.println("");
		System.out.println("");
		System.out.println("---- Cost of white Ceramic Tile ----");
		System.out.println("1m square cost 200kr");
		System.out.print("How many Square meters do you want to buy? : ");
		squareInput = reader.nextDouble();
		
		costResult = squareInput * tileCost;
		
		System.out.println("Your cost will be " + costResult + " kr");
		
		System.out.println("");
		System.out.println("");
		System.out.println("---- Mortgage Calculator ----");
		System.out.print("Put in annual intrest rate: ");
		interestYear = reader.nextDouble();
		interestMonth = interestYear / 1200;
		System.out.print("Put in over how many years you want to pay this: ");
		years = reader.nextInt();
		System.out.print("How much is the loan? : ");
		amountLoan = reader.nextDouble();
		paymentPerMonth = amountLoan * interestMonth / (1-1 / Math.pow(1 + interestMonth, years * 12));
		
		System.out.println("You will have to pay " + paymentPerMonth + " per month for " + years + " years.");
		
		System.out.println("");
		System.out.println("");
		System.out.println("---- Change Return ----");
		System.out.print("How much does it cost: ");
		cost = reader.nextDouble();
		System.out.print("How much money are you giving? : ");
		myMoney = reader.nextDouble();
		if(cost > myMoney)
		{
			System.out.println("Sorry. You don't have enough money.");
		}
		else
		{
			moneyReturn = myMoney - cost;
			System.out.println("And here is " + moneyReturn + " back to you.");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("---- Decimal/Binary Conversion ----");
		System.out.print("Enter decimal Number: ");
		decimal = reader.nextInt();
		System.out.println("Binary for that decimal is: " + Integer.toString(decimal,2));
		
		System.out.println("");
		System.out.println("");
		System.out.println("---- Simple Calc ----");
		System.out.print("Type first Number: ");
		firstNumber = reader.nextDouble();
		System.out.print("Type in Operator ex. / * + - : ");
		operator = reader.next();
		System.out.print("Type second Number: ");
		secondNumber = reader.nextDouble();
		
		if(operator.contains("/"))
		{
			resultNumber = firstNumber / secondNumber;
		}
		if(operator.contains("*"))
		{
			resultNumber = firstNumber * secondNumber;
		}
		if(operator.contains("+"))
		{
			resultNumber = firstNumber + secondNumber;
		}
		if(operator.contains("-"))
		{
			resultNumber = firstNumber - secondNumber;
		}
		
		System.out.println(firstNumber + " " + operator + " " + secondNumber + " is " + resultNumber);
		
		reader.close();
	}
}
