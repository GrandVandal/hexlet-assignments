package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {

    private final String tagBody;
    private final List<Tag> childrenTags;

    public PairedTag(
            String tagName,
            Map<String, String> attributes,
            String tagBody,
            List<Tag> childrenTags
    ) {
        super(tagName, attributes);
        this.tagBody = tagBody;
        this.childrenTags = childrenTags;
    }

    public String childrenTagsToString() {
        return childrenTags.stream()
                .map(Tag::toString)
                .collect(Collectors.joining());
    }

    @Override
    public String toString() {
        return String.format("%s%s</%s>",
                super.toString(),
                tagBody + childrenTagsToString(),
                super.getTagName()
        );
    }
}
// END
