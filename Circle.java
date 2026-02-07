import java.util.Scanner;
public class Circle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter are radius (cm) :");

        double radius = sc.nextDouble();

        final double PI = 22/7.0;
        final double AREA = PI* (radius*radius);
        final double PERIMETER = 2*PI*radius;
        System.out.println("radius : "+radius);
        System.out.println("area : "+AREA);
        System.out.println("perimeter : "+PERIMETER);
    }
    
}
