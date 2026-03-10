class NumberPatternContinous{
    public static void main(String[] args) {
        int n=4;
        int num=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                num=j*n+i+1;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}