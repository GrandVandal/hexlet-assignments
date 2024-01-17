package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {

    public static boolean scrabble(String chrText, String word) {
        var wordChars = new ArrayList<Character>();
        for (char chr : word.toLowerCase().toCharArray()) {
            wordChars.add(chr);
        }

        for (char chr : chrText.toLowerCase().toCharArray()) {
            if (wordChars.contains(chr)) {
                wordChars.remove((Character) chr);
            }
        }

        return wordChars.isEmpty();
    }

}
//END
