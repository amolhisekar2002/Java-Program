import java.util.Scanner;
class Power1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entert the num");
        int num =sc.nextInt();

        System.out.println("Enter the  power");
        int pow =sc.nextInt();

        if(pow<0){
            pow=pow*1;
            pow=1/num;
        }
        double op=1;
        for(int i=1; i<=pow; i++){
            op=op*num ;
        }
        System.out.println(op);
    }

    
}
