
import java.util.*;

public class Pblm_FIND_STRICT_AVERAGE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a + b) / 2.0;

        if (avg > c) {
            System.out.println("Yes,the average of " + a + " and " + b + " is strictly greater than " + c);
        } else {
            System.out.println("No,the average of " + a + " and " + b + " is not strictly greater than " + c);
        }

    }
}
