import java.util.Scanner;
class  MEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entert the  start number : ");
        int start = sc.nextInt();
        System.out.println("Entert the end number: ");
        int end= sc.nextInt();

        evenNumber(start,end);
        
    }
    public static void evenNumber(int start, int end) {
        while(start<=end){
            if(isEven(start)){
                System.out.println(start);
            }
            start++;
        } 
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
