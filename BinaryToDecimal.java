import java.util.Scanner;
class BinaryToDecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num =sc.nextInt();

        int pow =1;
        int dec = 0;
        while (num!=0) { 
            int last = num%10;
            if(last!=0){
                dec =dec+(last*pow);
 
            }
            pow*=2;
            num/=10;
            
        }
        System.out.println(dec);
    }
}