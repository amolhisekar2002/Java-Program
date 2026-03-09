class SnakeNumberPattern {
    public static void main(String[] args) {
        
        int num=0;
        int n=4;

        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++){
                if(j%2==0){
                    num=j*n+i+1;
                }
                else{
                    num=(j+1)*n-i;
                }
                System.out.print(num+ " ");

            }
            System.out.println();
        }

    }
}