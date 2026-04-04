public class RecRectangle {
    public static void main(String[] args) {
        rectangle(0,0,5);
        
    }
    public static void rectangle(int i, int j, int n){
        if(i<3){
            if (j<5) {
                System.out.print("*"+" ");
                rectangle(i,j+1,n);
            }
            else if(j==n){
                System.out.println();
                rectangle(i+1,0,n);
            }
        }
    }
}
