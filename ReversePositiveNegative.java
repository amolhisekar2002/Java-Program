import java.util.Scanner;
class ReversePositiveNegative 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int sign = num;
		num =Math.abs(num);

		int rev = 0;

		while (num>0)
		{
			int digit = num%10;
			rev = rev *10 +digit;
			num = num/10;
		}
		if (sign<0)
		{
			rev = -rev;
		}
		System.out.println("Reverse number is: " + rev);
	}
}
