
import java.util.*;

public class Pblm_Exam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of sections : ");

        int x = sc.nextInt();

        System.out.print("Input number of students per section : ");

        int y = sc.nextInt();
        int total_students = x * y;

        System.out.print("Input total number of passing students : ");

        int z = sc.nextInt();

        double pass_rate = (z * 100.0) / total_students;

        if (pass_rate > 50) {
            System.out.println("The pass rate " + pass_rate + "% is strictly greater than 50%.");
        } else {
            System.out.println("The pass rate " + pass_rate + "% is not strictly greater than 50%.");
        }
    }
}
