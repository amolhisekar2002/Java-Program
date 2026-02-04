import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for (; ; )
		{
			System.out.println("\n**********WELCOME**********\n");
			System.out.println("Amount:");
			double amount =sc.nextDouble();
			if (amount<1000 ||amount>100000){
				System.out.println("\n INVALID AMOUNT");
				continue;
			}
	     	System.out.println("Rate odf Intreast(P.M):");
		    double interest = sc.nextDouble();
		    if (interest< 1|| interest>30){
			System.out.println("\n INVALID INTEREST");
			continue;
	    	}
	    	System.out.print("Loan tenure (monthes)");
	    	int tenure = sc.nextInt();
		    if (tenure <3|| tenure>36){
			System.out.println("\n INVALID TENURE\n");
			continue;
		    }
		    double perMonthInt = (amount/100)*interest;
		    double totalInterestAmount = perMonthInt*tenure;
		    double emi =(amount+totalInterestAmount)/tenure;
		    double totalAmount = amount+totalInterestAmount;

		    System.out.println("\n Monthly Emi :" +emi);
	    	System.out.println("Principal Amount : "+amount);
		    System.out.println("Total Interest :"+totalInterestAmount);
	    	System.out.println("Total Amount :" +totalAmount);

		}

	}
}
