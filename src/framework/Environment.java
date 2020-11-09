package framework;

import io.github.cdimascio.dotenv.Dotenv;

import java.io.File;

public class Environment
{
    private final Dotenv dotenv;
    private final String environmentName;

    public Environment()
    {
        File dotenvFile = new File(".env.local");

        if (dotenvFile.exists()) {
            dotenv = Dotenv
                .configure()
                .filename(".env.local")
                .load();
        } else {
            dotenv = Dotenv
                .configure()
                .filename(".env")
                .load();
        }

        this.environmentName = dotenv.get("ENV");
    }

    public String get(String variable)
    {
        return this.dotenv.get(variable);
    }

    public boolean isDev()
    {
        return this.environmentName.equals("dev");
    }
}
