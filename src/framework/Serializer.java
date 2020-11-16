package framework;

import domain.Serializable;

import java.util.Map;

public class Serializer
{
    public String serialize(Serializable object)
    {
        StringBuilder data = new StringBuilder();

        data.append("{");

        for (Map.Entry<String, String> entry : object.serialize().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            data
                .append("\"")
                .append(key)
                .append("\":\"")
                .append(value)
                .append("\",");
        }

        data.append("}");

        int last = data.lastIndexOf(",");
        data.replace(last, last + 1, "");

        return data.toString();
    }
}
