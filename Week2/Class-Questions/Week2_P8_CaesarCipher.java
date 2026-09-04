import java.util.Scanner;

public class Week2_P8_CaesarCipher {

    public static String caesarCipher(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c = (char) (
                        (c - 'A' + 1) % 26 + 'A'
                );
            } else if (c >= 'a' && c <= 'z') {
                c = (char) (
                        (c - 'a' + 1) % 26 + 'a'
                );
            }

            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println(caesarCipher(text));

        sc.close();
    }
}
