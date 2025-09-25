
import java.util.*;

public class Pblm_Work_Hour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input normal work hour per day : ");

        double x = sc.nextDouble();

        System.out.print("Input work hour for Wendesday :");

        double y = sc.nextDouble();

        if (y > x) {
            System.out.println("Wendesday is Chill Day. So, you should work less than normal day.");
        } else {

            double total_work_hour = (4 * x) + y;

            System.out.println("Total working hours in one week : " + total_work_hour + " hours.");

        }

    }

}
