import java.util.Scanner;

class VolumeOfCylinder {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the radius of the cylinder :");
         double radius = sc.nextDouble();
         System.out.println("Enter the height of the cylinder :");
         double height = sc.nextDouble();
         double area = 3.14*radius*radius;
         double volume = area*height;
         System.out.println("Volume of the cylinder is : " + volume);
        System.err.println("Area of the cylinder is : " + area);
    }
    
}
