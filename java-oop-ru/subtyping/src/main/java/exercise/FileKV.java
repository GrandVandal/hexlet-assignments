package exercise;

// BEGIN
import java.util.Map;

public final class FileKV implements KeyValueStorage {

    private final String path;

    public FileKV(String path, Map<String, String> defaultKV) {
        this.path = path;
        String json = Utils.serialize(defaultKV);
        Utils.writeFile(path, json);
    }

    @Override
    public void set(String key, String value) {
        String json = Utils.readFile(path);
        Map<String, String> dataMap = Utils.unserialize(json);

        dataMap.put(key, value);

        json = Utils.serialize(dataMap);
        Utils.writeFile(path, json);
    }

    @Override
    public void unset(String key) {
        String json = Utils.readFile(path);
        Map<String, String> dataMap = Utils.unserialize(json);

        dataMap.remove(key);

        json = Utils.serialize(dataMap);
        Utils.writeFile(path, json);
    }

    @Override
    public String get(String key, String defaultValue) {
        String json = Utils.readFile(path);
        Map<String, String> dataMap = Utils.unserialize(json);
        if (dataMap.containsKey(key)) {
            return dataMap.get(key);
        }
        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        String json = Utils.readFile(path);
        return Utils.unserialize(json);
    }
}
// END
