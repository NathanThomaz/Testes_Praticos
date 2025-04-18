// Package: TesteQualidadeDeSoftware.semana2.util
package TesteQualidadeDeSoftware.semana2.util;

public class ConversorTemperatura {

    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public boolean temperaturaEhValida(double temperatura) {
        return temperatura >= -273.15;
    }
}
