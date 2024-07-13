public class Pattern1 {
    public static void main(String args[]){
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
