import java.util.Scanner;
public class RangeOfLeap {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the starting year :");
        int start = sc.nextInt();

        System.out.println("Enter the ending year :");
        int end = sc.nextInt();
        System.out.println("Leap years between " + start + " and " + end + " are:");
        while(start<=end){
            if((start%4==0 && start%100!=0) || start%400==0){
                System.out.print(start+ " ");
            }
            start++;
        }
    }
    
}
