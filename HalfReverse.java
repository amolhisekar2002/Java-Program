import java.util.Scanner;

public class HalfReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt(); // 1234

        int ct =0;                      // ct = 4;
        for(int i=num; i!=0; i/=10){    //1234/10=123 - 123/10=12 - 12/10=1 - 1/10=0
            ct++;                       // 0  1  2  3  4
        }
        if(ct % 2==0){                  // 4%2==0 --> true
            int pow = 1;                
            for(int i=0; i<ct/2; i++){   // 4/2=2
                pow*=10;                  // pow=1*10=10 <-> 10*10=100
            }
            int lastHalf = num % pow;     // lastHalf =1234%100 = 34
            num = num/pow;                // lastHalf = 1234/100 = 12

            while(lastHalf !=0){                  // 34 !=0 --> true
                num = num * 10+(lastHalf % 10);   // 12*10+4= 124   124*10+3=1234
                lastHalf /=10;                     // 
            }
        }
        System.out.println("Reverse Number :" +num);
    }
    
}
