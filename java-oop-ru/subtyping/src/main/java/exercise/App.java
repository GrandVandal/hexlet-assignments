package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public final class App {

    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> storageMap = storage.toMap();
        Set<String> keysSet = storageMap.keySet();

        for (String key : keysSet) {
            storage.set(storageMap.get(key), key);
            storage.unset(key);
        }
    }
}
// END
