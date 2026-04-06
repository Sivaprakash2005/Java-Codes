package Question;

import java.util.Scanner;

public class containdup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int c = 0; 
        for (int i = 0; i < n; i++) { 
            for (int j = i+1; j < n; j++) {
                if (a[i] == a[j]) {
                    c++;
                    break;
                }
            }
        }
        System.out.println("Array contain "+c+" duplicates:");
        sc.close();
    }
}
