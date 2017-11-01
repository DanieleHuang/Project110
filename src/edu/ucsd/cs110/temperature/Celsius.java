package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {

        Celsius retVal = new Celsius(this.getValue());
        return retVal;
    }

    @Override
    public Temperature toFahrenheit() {
        float ret = this.getValue();

        ret = (ret * 9)/5 + 32;
        Fahrenheit retVal = new Fahrenheit(ret);
        return retVal;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue()+ " C";
    }
}

