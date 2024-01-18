package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

    public static long getCountOfFreeEmails(List<String> emails) {
        long gmailCount = emails.stream()
                .filter(email -> email.endsWith("gmail.com"))
                .count();
        long yandexCount = emails.stream()
                .filter(email -> email.endsWith("yandex.ru"))
                .count();
        long hotmailCount = emails.stream()
                .filter(email -> email.endsWith("hotmail.com"))
                .count();
        return gmailCount + yandexCount + hotmailCount;
    }
}
// END
