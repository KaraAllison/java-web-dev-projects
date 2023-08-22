import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        String str = "If the product of two terms is zero then common sense says at least one of the two " +
                "terms has to be zero to start with. So if you move all the terms over to one side, you can " +
                "put the quadratics into a form that can be factored allowing that side of the equation to " +
                "equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] characters = str.toCharArray();
        for (char letter : characters) {
            if (charCount.containsKey(letter)) {
                int num = charCount.get(letter);
                charCount.put(letter, num + 1);
            } else {
                charCount.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> charEntry : charCount.entrySet()) {
            System.out.println(charEntry.getKey() + ": " + charEntry.getValue());
        }

    }
}
