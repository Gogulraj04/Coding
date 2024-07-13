import java.util.*;
public class Popularity {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int carr[]=new int[n];
        int minpop=n/4;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            carr[i]=count;
        }
        for(int i=0;i<carr.length;i++){
            if(carr[i]>=minpop){
                System.out.println(arr[i]);
            }
        }
    }
}
