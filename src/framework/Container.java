package framework;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

import java.util.HashMap;

public class Container
{
    private final Environment environment;
    private final HashMap<String, Object> services;

    public Container(Environment environment)
    {
        this.environment = environment;
        this.services = new HashMap<>();
        this.register();
    }

    private void register()
    {
        this.services.put(
            "aws.credentials",
            AwsBasicCredentials.create(
                this.environment.get("AWS_ACCESS_KEY_ID"),
                this.environment.get("AWS_SECRET_ACCESS_KEY")
            )
        );
        this.services.put(
            "aws.dynamodb.eu-west",
            DynamoDbClient
                .builder()
                .region(Region.EU_WEST_1)
                .credentialsProvider((AwsCredentialsProvider) this.services.get("aws.credentials"))
                .build()
        );
    }

    public Object get(String serviceName)
    {
        return this.services.get(serviceName);
    }
}
