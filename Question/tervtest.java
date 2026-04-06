package Question;
import java.util.*;
public class tervtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();//intput [1,6,2,4] [5,3,9,10]
        String r = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c != '[' && c != ']' && c != ',' && c != ' ') {
                r += c; 
            } else if (c == ',' || c == ' ') {
                r += ' ';
            }
        }
        String[] numbers = r.trim().split("\\s+");
        int s = numbers.length;
        int[] res = new int[s];
        for (int i = 0; i < s; i++) {
            res[i] = Integer.parseInt(numbers[i]);
        }
        for (int i = 0; i < s - 1; i++) {
            for (int j = 0; j < s - 1 - i; j++) {
                if (res[j] > res[j + 1]) {
                    int temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < s; i++) {
            if (i < (s - 1)) {
                System.out.print(res[i] + ",");
            } else {
                System.out.print(res[i]);
            }
        }
        System.out.print("]");//output [1,2,3,4,5,6,9,10]
        sc.close(); 
    }
}
