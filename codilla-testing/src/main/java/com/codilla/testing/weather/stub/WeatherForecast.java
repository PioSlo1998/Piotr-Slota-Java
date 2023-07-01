package com.codilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double averageTemp() {

        double sum = 0;
        for(Double temp : temperatures.getTemperatures().values()) {
            sum += temp;
        }
        return sum/temperatures.getTemperatures().size();
    }
}
