import java.util.Scanner;
class NthPrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		int ct = 0;
		int start = 2;
		while (true)
		{
			int den =2;
			while (den < start)
			{
				if (start % den==0)
				{
					break;
				}
				den++;
			}
			if (den == start)
			{
				ct++;
				if (ct == num)
				{
					System.out.println("Nth Prime Number :"+start);
					break;
				}
			}
			start++;
		}
	}
}
