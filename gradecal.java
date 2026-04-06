import java.util.*;
public class gradecal {
    public static void main(String[] args) {
        System.out.print("Enter your CGPA: ");
        float cgpa=sc.nextFloat();
        switch ((int)cgpa) {
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Less Grade");
        }
    }
    static Scanner sc = new Scanner(System.in);
}
