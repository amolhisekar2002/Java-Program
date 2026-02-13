import java.util.Scanner;
class EvenOddCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();

		int evenCount = 0;
		int oddCount = 0;

		while (num>0)
		{
			int digit = num%10;
			if (num%2==0)
			{
				evenCount++;
			}
			else{
				oddCount++;
			}
			num/=10;
		}
		System.out.println("Even digit counts :"+ evenCount);
		System.out.println("Odd digit counts :"+ oddCount);

	}
}
