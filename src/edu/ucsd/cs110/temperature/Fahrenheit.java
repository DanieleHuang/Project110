package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float ret = this.getValue();
        ret = ((ret - 32) * 5)/9;
        Celsius retVal = new Celsius(ret);
        return retVal;
    }

    @Override
    public Temperature toFahrenheit() {

        Fahrenheit retVal = new Fahrenheit(this.getValue());
        return retVal;
    }

    public String toString() {
        return this.getValue() + " F";
    }
}

