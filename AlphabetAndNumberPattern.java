public class AlphabetAndNumberPattern {

    public static void main(String[] args) {
        int n=5;
        char ch ='a';
        int num=1;

        for(int i=0; i<n;i++){
            for(int j=0; j<3; j++){
                System.out.print(ch+" "+num+" ");
                ch++;
                num++;

            }
            System.out.println();
        }
    }
}