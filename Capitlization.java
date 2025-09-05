import java.util.*;

public class Capitlization {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder cStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (i == 0) {
                cStr.append(Character.toUpperCase(ch));
            } else {
                cStr.append(Character.toLowerCase(ch));
            }

        }

        System.out.println("Capitalized String: " + cStr);

    }
}