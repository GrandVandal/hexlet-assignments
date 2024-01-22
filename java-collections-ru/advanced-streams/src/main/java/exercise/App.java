package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {

    public static String getForwardedVariables(String text) {
        return Arrays.stream(text.split("\n"))
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.replaceAll("environment=", "")
                        .replaceAll("\"", ""))
                .map(line -> Arrays.stream(line.split(","))
                        .filter(e -> e.startsWith("X_FORWARDED_"))
                        .map(e -> e.replace("X_FORWARDED_", ""))
                        .collect(Collectors.joining(",")))
                .filter(line -> !line.isEmpty())
                .collect(Collectors.joining(","));
    }
}
//END
