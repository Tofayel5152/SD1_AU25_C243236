import java.util.*;

public class Pblm_Fill_Water {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input if the 1st bottle is full (1) or not (0)  : ");
        int B1 = sc.nextInt();

        System.out.print("Input if the 2nd bottle is full (1) or not (0)  : ");
        int B2 = sc.nextInt();

        System.out.print("Input if the 3rd bottle is full (1) or not (0)  : ");
        int B3 = sc.nextInt();

        if (B1 == 1) {
            if (B2 == 0 && B3 == 0)
                System.out.println("Water filling time.");
            else
                System.out.println("Not now.");
        } else {
            if (B2 == 0 || B3 == 0)
                System.out.println("Water filling time.");
            else
                System.out.println("Not now.");

        }

    }
}
