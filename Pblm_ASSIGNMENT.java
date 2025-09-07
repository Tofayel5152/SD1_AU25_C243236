
import java.util.*;

public class Pblm_ASSIGNMENT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input starting time : ");

        double x = sc.nextDouble();

        if (x + 3 > 10) {
            System.out.println("He can't complete the assignment in time.");
        } else {
            System.out.println("He can complete the assignment in time.");
        }

    }
}
