package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {

    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        var dataDiff = new LinkedHashMap<String, String>();
        var allData = new TreeSet<String>();

        allData.addAll(data2.keySet());
        allData.addAll(data1.keySet());
        for (String key : allData) {
            Object dataValue1 = data1.get(key);
            Object dataValue2 = data2.get(key);

            if (dataValue2 == null) {
                dataDiff.put(key, "deleted");
                continue;
            }
            if (dataValue1 == null) {
                dataDiff.put(key, "added");
                continue;
            }
            if (dataValue2.equals(dataValue1)) {
                dataDiff.put(key, "unchanged");
                continue;
            }
            dataDiff.put(key, "changed");
        }

        return dataDiff;
    }
}
//END
