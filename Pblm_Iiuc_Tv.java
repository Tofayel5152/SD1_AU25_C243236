
import java.util.*;

public class Pblm_Iiuc_Tv {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Subscription cost :");
        int x = sc.nextInt();

        System.out.print("Input number of friends :");
        int n = sc.nextInt();

        double s = Math.ceil(n / 6.0);

        System.out.println("Total Taka for " + s + " subscription : " + s * x + " tk.");
        System.out.println("Each friend has to pay : " + (s * x) / 6 + " tk.");

    }
}
