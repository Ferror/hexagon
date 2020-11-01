package presenter.console;

import io.github.cdimascio.dotenv.Dotenv;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

public class ConsoleApp
{
    public static void main(String[] args)
    {
        Dotenv dotenv = Dotenv
                .configure()
                .load();

        AwsBasicCredentials credentials = AwsBasicCredentials.create(
            dotenv.get("AWS_ACCESS_KEY_ID"),
            dotenv.get("AWS_SECRET_ACCESS_KEY")
        );

        DynamoDbClient client = DynamoDbClient.builder()
            .region(Region.EU_WEST_1)
            .credentialsProvider(StaticCredentialsProvider.create(credentials))
            .build();

        System.out.println("Hello");
    }
}
