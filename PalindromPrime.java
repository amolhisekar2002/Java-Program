import java.util.Scanner;
public class PalindromPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();

        int den = 2;

        while(den<num){
            if (num%den ==0) {
                break;
                
            }
            den++;
        }
        if(den == num){
            int rev =0;
            for(int i=num; i!=0; i/=10){
                rev = rev * 10 + (i%10);
            }
            if(num == rev){
                System.out.println("It is a palindrome");
            }
            else{
                System.out.println("It is NOT a palindrome");
            }

        }
        else{
            System.out.println("It is not a Prime number");
        }

    }
    
}
