public class Pattern4 {
    public static void main(String[] args) {
        int row=4;
        System.out.println();
        for(int i=0;i<=row;i++){
            int count=i;
            for(int j=0;j<=i*2;j++){
                System.out.print(count);
                if(i>j){
                    count--;
                }
                else{
                    count++;
                }
            }
            System.out.println();
        }
    }
}
