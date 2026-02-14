class Factorial{
    public static void main(String[] args) {
        int base = 2;
        int rev = 5;
        int res = 1;
       /* while(rev >0){
            res = res*base;
            rev--;
        }
        System.out.println("2^5="+res);
        */
       for(int i=1; i<=rev;i++){
        res = res * base;
        System.err.println("2^5="+res);
       }
    }
}