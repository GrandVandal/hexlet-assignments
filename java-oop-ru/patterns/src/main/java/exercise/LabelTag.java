package exercise;

// BEGIN
public class LabelTag implements TagInterface {

    String label;
    TagInterface tag;

    public LabelTag(String label, TagInterface tag) {
        this.label = label;
        this.tag = tag;
    }

    public String render() {
        return String.format("<label>%s%s</label>", label, tag.render());
    }
}
// END
