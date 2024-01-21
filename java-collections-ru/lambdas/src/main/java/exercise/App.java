package exercise;

import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {

    public static String[][] enlargeArrayImage(String[][] image) {
        return Arrays.stream(image)
                .map(arr -> Arrays.stream(arr)
                        .flatMap(e -> Stream.of(e, e))
                        .toArray(String[]::new))
                .flatMap(arr -> Stream.of(arr, arr))
                .toArray(String[][]::new);
    }

}
// END
