public class RecRightTriangle {

    public static void main(String[] args) {
        triangle(0,0,5);
    }
    public static void triangle(int i, int j , int n){
        if (i>n) {
           return; 
        }
        if(j<=i){
            System.out.print("*"+" ");
            triangle(i,j+1,n);
        }
        else{
            System.out.println();
            triangle(i+1,0,n);
        }
    }
}