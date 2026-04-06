package Question;
import java.util.*;
public class zeroeve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                a[i]=0;
            }
        }
        System.out.println("Array:");
        for(int num:a){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
