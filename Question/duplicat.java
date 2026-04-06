package Question;

import java.util.Scanner;

public class duplicat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] r = new int[n];
        int c = 0; 
        for (int i = 0; i < n; i++) {
            boolean co = true; 
            for (int j = 0; j < c; j++) {
                if (a[i] == r[j]) {
                    co = false; 
                    break;
                }
            }
            if (co) {
                r[c] = a[i];
                c++; 
            }
        }
        int[] result = new int[c];
        for (int i = 0; i < c; i++) {
            result[i] = r[i];
        }
        System.out.println("Array without duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
