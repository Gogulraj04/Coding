import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int num=65;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)num);
            }
            System.out.println();
            num++;
        }
    }
}
