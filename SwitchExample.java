import java.util.*;;
public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day: ");
        int day = sc.nextInt();
        String n;
        switch (day) {
            case 1:
                n = "Monday";
                break;
            case 2:
                n = "Tuesday";
                break;
            case 3:
                n = "Wednesday";
                break;
            case 4:
                n = "Thursday";
                break;
            case 5:
                n = "Friday";
                break;
            case 6:
                n = "Saturday";
                break;
            case 7:
                n = "Sunday";
                break;
            default:
                n = "Invalid day";
        }
        System.out.println("Day of the week: " + n);
        sc.close();
    }
}
