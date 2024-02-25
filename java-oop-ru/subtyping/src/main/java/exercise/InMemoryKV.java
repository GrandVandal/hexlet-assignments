package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public final class InMemoryKV implements KeyValueStorage {

    private final Map<String, String> storage;

    public InMemoryKV(Map<String, String> defaultKV) {
        this.storage = new HashMap<>(defaultKV);
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        if (storage.containsKey(key)) {
            return storage.get(key);
        }
        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(storage);
    }
}
// END
