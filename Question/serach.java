package Question;

import java.util.Scanner;

public class serach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter num to search:");
        int s=sc.nextInt();
        int c=0;
        for(int num:a){
            c++;
            if(s==num){
                System.out.println("Num found at "+c);
            }
        }
        sc.close();
    }
}
