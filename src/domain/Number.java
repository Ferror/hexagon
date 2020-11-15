package domain;

public class Number implements Updatable<Number>
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

    @Override
    public void update(Number self)
    {
        this.value = self.value;
    }
}
