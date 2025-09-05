
import java.util.*;

public class Too_Long_Word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        int length = s.length();

        if (length > 6) {
            System.out.println("" + s.charAt(0) + (length - 2) + s.charAt(length - 1));

        } else
            System.out.println(s);

    }

}