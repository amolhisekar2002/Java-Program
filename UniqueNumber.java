import java.util.Scanner;
class UniqueNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();

        while(num !=0){
            int last = num%10;
            num/=10;

            int temp =num;
            while (temp!=0) { 
                if(last != temp%10){
                    temp/=10;
                }
                else{
                    break;
                }

            }
            if(temp!=0){
                break;
            }
        }
        if(num==0){
            System.out.println("It is unique number");
        }
        else{
            System.out.println("It is not uique number :");
        }
    }
}