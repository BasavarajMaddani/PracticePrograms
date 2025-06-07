import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class CharacterDuplicate {
    public static void main(String[] args) {

        String str = "aabbccdd";
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);   ///unique character and insertion order

        }
        System.out.println("Set values " + set);
        for (char c : set) {
            result.append(c);
        }

        System.out.println("String value " + result);
    }
}