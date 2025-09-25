import java.util.*;

public class Easy_2_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        int length = word.length();
        int vCount = 0, cCount = 0;

        for (int i = 0; i < length; i++) {

            if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O'
                        || word.charAt(i) == 'U')
                    vCount++;
                else
                    cCount++;
            }

            else if (word.charAt(i) >= 97 && word.charAt(i) <= 122) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                        || word.charAt(i) == 'u')
                    vCount++;
                else
                    cCount++;
            }

        }

        System.out.println("Vowels: " + vCount);
        System.out.println("Consonants: " + cCount);

    }
}