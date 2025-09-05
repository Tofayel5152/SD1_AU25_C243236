
import java.util.*;

public class Easy_2_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        System.out.println("1. Convert to Uppercase\n" + "2. Convert to Lowercase");
        System.out.println("Pick option: ");

        int option = sc.nextInt();

        if (option == 1) {

            StringBuilder upper = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    upper.append((char) (ch - ('a' - 'A')));
                } else {
                    upper.append(ch);
                }
            }
            System.out.println("Uppercase: " + upper);

        } else if (option == 2) {

            StringBuilder lower = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    lower.append((char) (ch + ('a' - 'A')));
                } else {
                    lower.append(ch);
                }
            }
            System.out.println("Lowercase: " + lower);

        } else {

            System.out.println("Invalid Option!");

        }

    }
}