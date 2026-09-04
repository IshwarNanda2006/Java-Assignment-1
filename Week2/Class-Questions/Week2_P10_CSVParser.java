import java.util.Scanner;

public class Week2_P10_CSVParser {

    public static void parseCSV(String csvLine) {
        String[] fields = csvLine.split(",");

        for (String field : fields) {
            System.out.println(field.trim());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV line: ");
        String csvLine = sc.nextLine();

        parseCSV(csvLine);

        sc.close();
    }
}
