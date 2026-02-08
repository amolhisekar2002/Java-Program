import  java.util.Scanner;
public class AreaPerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Widht of Recatangle (cm):");
        double width = sc.nextDouble();

        System.out.println("Enter Height of Rectangle (cm):");
        double height = sc.nextDouble();
        
        double area = width *height;
        double perimeter = 2*(width + height);

        System.out.println("Area of Rectangle is : " + area);
        System.out.println("Perimeter of Rectangle is : " + perimeter);
        
    }
    
}
