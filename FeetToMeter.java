import java.util.Scanner;
class FeetToMeter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length in Feet :");
        double feet = sc.nextDouble();
        double meter = 0.305 * feet;
        System.out.println("Length in Meter is : " + meter);

    

    }
}