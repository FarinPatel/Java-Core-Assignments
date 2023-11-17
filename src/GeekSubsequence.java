import java.util.HashSet;
import java.util.Set;

public class GeekSubsequence {

    public static Set<String> allSubsequences(String str) {

        Set<String> subsequences = new HashSet<>();

        for (int i = 0; i < (1 << str.length()); i++) {
            StringBuilder sub = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if ((i & (1 << j)) > 0) {
                    sub.append(str.charAt(j));
                }
            }
            subsequences.add(sub.toString());
        }
        return subsequences;
    }

    public static String betterString(String str1, String str2) {

        Set<String> str1new = allSubsequences(str1);
        Set<String> str2new = allSubsequences(str2);

        if (str1new.size() >= str2new.size()) {
            return str1;
        } else {
            return str2;
        }
    }

    public static void main(String[] args) {
        String str1 = "ggf";
        String str2 = "bgght";


        String better = betterString(str1, str2);
        System.out.println("Better string: " + better);
    }
}