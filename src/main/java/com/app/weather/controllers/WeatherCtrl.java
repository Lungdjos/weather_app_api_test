package com.app.weather.controllers;

import com.app.weather.model.pojo.ForecastData;
import com.app.weather.model.pojo.WeatherData;
import com.app.weather.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WeatherCtrl {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherData getCurrentWeather(@RequestParam String city, @RequestParam String country) {
        return weatherService.getCurrentWeather(city, country);
    }

    @GetMapping("/forecast")
    public ForecastData[] getForecast(@RequestParam String city, @RequestParam String country) {
        return weatherService.getForecast(city, country);
    }
}
