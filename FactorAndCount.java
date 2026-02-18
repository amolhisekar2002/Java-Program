import java.util.Scanner;
class FactorAndCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();

		int den= 1;
		int ct =1;
		while (den <= num/2)
		{
			if (num%den==0)
			{
				System.out.println(den);
				ct++;
			}
			den++;
		}
		System.out.println("Factor :"+num);
		System.out.println("Total Factor of Count :"+ct);
	}
}
