import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number");
        int num = sc.nextInt();

        int den = 2;
        int ct = 1;
        while(den < num ){
            if(num%den==0){
                break;
            }
            den++;
        }
        ct++;
        if(num==den){
            System.out.println("It is a prime");
        }
        else{
            System.out.println("NOt a prime");
        }
    }
}
