package com.codilla.testing.weather.mock;

import com.codilla.testing.weather.stub.Temperatures;
import com.codilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    private static final Map<String, Double> temperaturesMap = new HashMap();

    @BeforeAll
    public static void dataCreator() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 27.5);
        temperaturesMap.put("Wroclaw", 18.9);
        temperaturesMap.put("Warszawa", 19.3);
        temperaturesMap.put("Gdansk", 13.2);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageTempMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //When
        double averageTemperature = weatherForecast.averageTemp();

        //Then
        assertEquals((25.5 + 27.5 + 18.9 + 19.3 + 13.2)/5, averageTemperature);
    }

    @Test
    void testMedianaTempMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //When
        double medianaTemperature = weatherForecast.medianaTemp();

        //Then
        assertEquals(19.3, medianaTemperature);
    }
}
