package framework;

import io.github.cdimascio.dotenv.Dotenv;

import java.io.File;

public class Environment
{
    private final Dotenv dotenv;

    public Environment()
    {
        File dotenvFile = new File(".env.local");

        if (dotenvFile.exists()) {
            this.dotenv = Dotenv
                .configure()
                .filename(".env.local")
                .load();
        } else {
            this.dotenv = Dotenv
                .configure()
                .filename(".env")
                .load();
        }
    }

    public String get(String variable)
    {
        return this.dotenv.get(variable);
    }

    public boolean isDev()
    {
        return this.dotenv.get("ENV").equals("dev");
    }
}
