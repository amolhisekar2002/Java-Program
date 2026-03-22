class RangeOfBuzzNumber{
    public static void main(String[] args) {
        buzzNumber(1,30);
    }
    public static void buzzNumber(int start , int end) {
        while(start<=end){
            if(Buzz(start)){
                System.out.println(start);
            }
            start++;
        }
    }
    public static boolean Buzz(int num) {
        if(num%7==0 || num%10==7){
            return true;
        }
        else{
            return false;
        }
        
    }
}