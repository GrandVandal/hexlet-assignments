package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {

    private final String tagName;
    private final Map<String, String> attributes;

    public Tag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public String attributesToString() {
        return attributes.entrySet().stream()
                .map(entry -> String.format(" %s=\"%s\"", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining(""));
    }

    public String toString() {
        return String.format("<%s>", getTagName() + attributesToString());
    }
}
// END
