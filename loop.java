public class loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
        int i=0;
        System.out.println("While Loop:" );
        while (i<=10 ) {
            if(i%2==0) {
                System.out.println("Even Number: " + i);
            }
            i++;
        }
        i=10;
        do {
            System.out.println("Do-While Number: " + i);
            i--;
       }while (i>0); 
    }            
}
