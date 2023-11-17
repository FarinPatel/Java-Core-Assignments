import java.util.Scanner;

public class CommonClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Str: ");
        String str = scanner.nextLine();

        System.out.print("Enter Patt: ");
        String patt = scanner.nextLine();

        int minIdx= -1;
        for (int i = 0; i < patt.length(); i++) {
            char commonChar = patt.charAt(i);
            int index = str.indexOf(commonChar);
            if (index != -1 && (minIdx == -1 || index < minIdx)) {
                minIdx = index;
            }
        }
        System.out.println(minIdx);
    }
}
