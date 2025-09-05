
import java.util.*;

public class Find_the_odd_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b)
            System.out.println(c + " is the odd one");

        else if (b == c)
            System.out.println(a + " is the odd one");

        else
            System.out.println(b + " is the odd one");

    }
}