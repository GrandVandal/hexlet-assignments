package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        //INIT
        var wordsCount = new HashMap<String, Integer>();
        var wordsList = new ArrayList<String>();

        //ENTRY FILTER
        if (sentence.isEmpty()) {
            return wordsCount;
        }

        //COUNTING WORDS
        Collections.addAll(wordsList, sentence.split(" "));
        wordsList.forEach((word) -> {
            wordsCount.compute(word, (key, count) -> count == null ? 1 : count + 1);
        });

        return wordsCount;
    }

    public static String toString(Map<String, Integer> itemsMap) {
        //INIT
        StringBuilder result = new StringBuilder();

        //ENTRY FILTER
        if (itemsMap.isEmpty()) {
            return result.append("{}").toString();
        }

        //BUILDING RESULT
        result.append("{\n");
        var entries = itemsMap.entrySet();
        for (var entry : entries) {
            result.append("  ").append(entry.getKey());
            result.append(": ").append(entry.getValue()).append("\n");
        }
        result.append("}");

        return result.toString();
    }

}
//END
