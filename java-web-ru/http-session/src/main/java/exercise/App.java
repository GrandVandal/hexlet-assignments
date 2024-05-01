package exercise;

import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class App {

    private static final List<Map<String, String>> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users", ctx -> {
            List<Map<String, String>> displayedUsers = new ArrayList<>();
            int page = ctx.queryParamAsClass("page", Integer.class).getOrDefault(1);
            int userNumber = ctx.queryParamAsClass("per", Integer.class).getOrDefault(5);

            int begin = (page - 1) * userNumber;
            int end = page * userNumber;
            for (int i = begin; i < end; i++) {
                if (i < USERS.size()) {
                    displayedUsers.add(USERS.get(i));
                }
            }

            ctx.json(displayedUsers);
        });
        // END

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
