package com.app.weather.services.implementation;

import com.app.weather.model.pojo.ForecastData;
import com.app.weather.model.pojo.WeatherData;
import com.app.weather.services.WeatherService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class WeatherServImpl implements WeatherService {

    private final RestTemplate restTemplate;

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    public WeatherServImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public WeatherData getCurrentWeather(String city, String country) {
        String url = String.format("%s/current?city=%s,%s&key=%s", apiUrl, city, country, apiKey);
        try {
            return restTemplate.getForObject(url, WeatherData.class);
        } catch (HttpClientErrorException e) {
            // Handle error (e.g., city not found)
            throw new RuntimeException("Error fetching current weather: " + e.getMessage());
        }
    }

    @Override
    public ForecastData[] getForecast(String city, String country) {
        String url = String.format("%s/forecast/daily?city=%s,%s&key=%s", apiUrl, city, country, apiKey);
        try {
            Map<String, Object> response = restTemplate.getForObject(url, Map.class);
            assert response != null;
            return (ForecastData[]) response.get("data"); // Adjust based on actual response structure
        } catch (HttpClientErrorException e) {
            // Handle error (e.g., city not found)
            throw new RuntimeException("Error fetching forecast: " + e.getMessage());
        }
    }
}
