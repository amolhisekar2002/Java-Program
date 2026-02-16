import java.util.Scanner;
public class SumEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int even = 0;
        int odd = 0;
        while(num>0){
            int digit = num%10;
            if (digit%2==0) {
                even=even+num; 
            }else{
                odd = odd+num;
            }
            num = num/10;

        }
        System.err.println("Even number addidtion :"+even);
        System.err.println("Odd number addidtion :"+odd);
    }
}