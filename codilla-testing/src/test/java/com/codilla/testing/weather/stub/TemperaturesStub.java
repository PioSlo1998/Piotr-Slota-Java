package com.codilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures {

    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();

        //dummy data
        stubResult.put("Rzeszow", 22.4);
        stubResult.put("Krakow", 25.4);
        stubResult.put("Wroclaw", 21.6);
        stubResult.put("Warszawa", 20.3);
        stubResult.put("Gdansk", 18.7);

        return stubResult;
    }
}
