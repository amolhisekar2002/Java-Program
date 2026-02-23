import java.util.Scanner;
public class PronicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int i = 0;
        for(;i<=num;i++){
            if(i*(i+1)==num){
                break;
            }
        
        }
        if(i<= num){
            System.out.println("It is pronic number");
        }
        else{
            System.out.println("It is not pronic number");
        }
    }
    
}
