
import java.util.*;

public class Easy_2_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        int length = word.length();
        int flag = 0;

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            System.out.println("PALINDROME");
        else
            System.out.println("NOT PALINDROME!");

    }
}