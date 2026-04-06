package Question;
import java.util.*;
public class sumoddeve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=0,o=0;
        for(int num:a){
            if(num%2==0){
                s+=num;
            }
            else{
                o+=num;
            }
        }
        System.out.println("Sum of even number:"+s);
        System.out.println("Sum of odd number:"+o);
        sc.close();
    }
}
