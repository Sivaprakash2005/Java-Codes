package Question;

import java.util.Scanner;

public class eveoddindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0,co=0;
        int s=0,o=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                s+=a[i];
                c++;
            }
            else{
                o+=a[i];
                co++;
            }
        }
        System.out.println("Sum of"+c+"even number:"+s);
        System.out.println("Sum of"+co+"odd number:"+o);
        sc.close();
    }
}
