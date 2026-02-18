import java.util.Scanner;
public class SumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int ct = 0;

        int sum = 0;
        int product = 1;
        while (num != 0) {
            int last = num%10;
            sum = sum + last;
            product = product * last;
            num = num /10;
            ct++;

        }
        if(sum == product ){
            System.out.println("Sum And product are same");
        }
        else{
            System.out.println("Not same sum and product");
        }
        System.out.println("Count : "+ct);
    }
    
}
