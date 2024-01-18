package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        var result = new ArrayList<Map<String, String>>();

        for (var book : books) {
            boolean containsAll = true;

            for (var entry : where.entrySet()) {
                if (!book.containsValue(entry.getValue())) {
                    containsAll = false;
                    break;
                }
            }

            if (containsAll) result.add(book);
        }

        return result;
    }
}
//END
