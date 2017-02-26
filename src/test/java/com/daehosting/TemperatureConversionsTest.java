package com.daehosting;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by student on 2/25/17.
 */
public class TemperatureConversionsTest {
    @Test
    public void fahrenheitToCelsiusTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celsius to fahrenheit conversion failed.", BigDecimal.valueOf(32), celsiusToFahrenheitResult);
    }

    @Test
    public void celsiusToFahrenheitTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));
        assertEquals("The fahrenheit to celsius conversion failed.", BigDecimal.valueOf(0), fahrenheitToCelsiusResult);
    }

    @Test
    public void windchillTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelsiusResult = service.windChillInFahrenheit(BigDecimal.valueOf(32.0), BigDecimal.valueOf(0));
        assertEquals("The fahrenheit to celsius conversion failed.", BigDecimal.valueOf(34.538), fahrenheitToCelsiusResult);
    }

}