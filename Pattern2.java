public class Pattern2 {
    public static void main(String[] args) {
        int row=4;
        int num=64;
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print( (char)num);
            }
            num--;
            System.out.println();
        }
    }
}
