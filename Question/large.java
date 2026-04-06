package Question;
import java.util.*;
public class large {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=a[i];
                }
            }
        }
        System.out.println("Largest num:"+a[0]);
        sc.close();
    }
}
