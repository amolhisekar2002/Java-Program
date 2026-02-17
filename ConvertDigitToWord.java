import java.util.Scanner;

class NumberToWords
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int rev = 0;

        // Step 1: Reverse the number
        while (num > 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        // Step 2: Convert digit to word
        while (rev > 0)
        {
            int digit = rev % 10;

            switch (digit)
            {
                case 0: System.out.print("zero "); break;
                case 1: System.out.print("one "); break;
                case 2: System.out.print("two "); break;
                case 3: System.out.print("three "); break;
                case 4: System.out.print("four "); break;
                case 5: System.out.print("five "); break;
                case 6: System.out.print("six "); break;
                case 7: System.out.print("seven "); break;
                case 8: System.out.print("eight "); break;
                case 9: System.out.print("nine "); break;
            }

            rev = rev / 10;
        }
    }
}
