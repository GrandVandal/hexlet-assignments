package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        var numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        var emptyList = new ArrayList<Integer>();

        var actualEmpty = App.take(emptyList, 4);
        assertThat(actualEmpty).isEmpty();

        var actualZero = App.take(numbers, 0);
        assertThat(actualZero).isEmpty();

        var actualOver = App.take(numbers, 10);
        assertThat(actualOver).isEqualTo(numbers);

        var actualOrd = App.take(numbers, 3);
        var expectedOrd = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertThat(actualOrd).isEqualTo(expectedOrd);
        // END
    }
}
