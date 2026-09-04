import java.util.Scanner;

public class Week2_P9_SentenceReverser {

    public static String reverseSentence(String sentence) {
        String trimmed = sentence.trim();

        if (trimmed.isEmpty()) {
            return "";
        }

        String[] words = trimmed.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.println(
                "Reversed Sentence: " +
                reverseSentence(sentence)
        );

        sc.close();
    }
}
