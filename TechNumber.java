import java.util.Scanner;
class TechNumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int ct =0;                      // ct =4
        for(int i=num; i!=0; i/=10){   //2025/10 - 202/10 - 20/10 - 2/10 = 0
            ct++;
        }                                
        if(ct%2==0){                   // check even 4%2==0 -> true
            int pow =1;

            for(int i=0; i<ct/2; i++){     // 4/2 = 2
                pow*=10;                  // pow = 1 * 10 = 10  <-> 10 *10= 100
            }
             int lastHalf = num % pow; //2025%100 = 25
             int firstHalf = num/pow; //2025/100 = 20

             int total = lastHalf + firstHalf; // 20 +25

             if((total *total)==num){
                System.out.println("IT IS TECH NUMBER :");

             }
             else{
                System.out.println("IT IS NOT TECH NUMBER :");
             }
        }
    }
}