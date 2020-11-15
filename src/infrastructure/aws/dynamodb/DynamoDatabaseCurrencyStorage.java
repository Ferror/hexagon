package infrastructure.aws.dynamodb;

import domain.Currency;
import domain.currency.CurrencyStorage;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import java.util.List;

public class DynamoDatabaseCurrencyStorage implements CurrencyStorage
{
    private final DynamoDbClient client;

    public DynamoDatabaseCurrencyStorage(DynamoDbClient client)
    {
        this.client = client;
    }

    @Override
    public List<Currency> getAll()
    {
        return null;
    }
}
