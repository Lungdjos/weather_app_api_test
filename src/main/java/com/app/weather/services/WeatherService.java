package com.app.weather.services;

import com.app.weather.model.pojo.ForecastData;
import com.app.weather.model.pojo.WeatherData;
import org.springframework.stereotype.Service;


public interface WeatherService {
    WeatherData getCurrentWeather(String city, String country);
    ForecastData[] getForecast(String city, String country);
}
