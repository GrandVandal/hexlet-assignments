package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {

    @Test
    void testEnlargeArrayImageEmpty() {
        String[][] image = {};
        String[][] actual = App.enlargeArrayImage(image);
        assertThat(actual).isEmpty();
    }

    @Test
    void testEnlargeArrayImageDeepEmpty() {
        String[][] image = {
                {},
                {},
                {},
                {},
        };
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
        };
        assertThat(actual).isEmpty();
        assertThat(actual).isDeepEqualTo(expected);
    }

    @Test
    void testEnlargeArrayImageExample() {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        assertThat(actual).isDeepEqualTo(expected);
    }

    @Test
    void testEnlargeArrayImageAllUnique() {
        String[][] image = {
                {"q", "W", "e", "r"},
                {"a", "s", "D", "F"},
                {"z", "X", "C", "V"},
                {"#", "1", "^", "("},
        };
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = {
                {"q", "q", "W", "W", "e", "e", "r", "r"},
                {"q", "q", "W", "W", "e", "e", "r", "r"},
                {"a", "a", "s", "s", "D", "D", "F", "F"},
                {"a", "a", "s", "s", "D", "D", "F", "F"},
                {"z", "z", "X", "X", "C", "C", "V", "V"},
                {"z", "z", "X", "X", "C", "C", "V", "V"},
                {"#", "#", "1", "1", "^", "^", "(", "("},
                {"#", "#", "1", "1", "^", "^", "(", "("},
        };
        assertThat(actual).isDeepEqualTo(expected);
    }
}
// END
