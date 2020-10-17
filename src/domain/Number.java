package domain;

public class Number
{
    private Integer value;

    public Number(Integer value)
    {
        this.value = value;
    }

    public Number add(Number number)
    {
        return new Number(this.value + number.value);
    }

    public Integer toInteger()
    {
        return this.value;
    }
}
