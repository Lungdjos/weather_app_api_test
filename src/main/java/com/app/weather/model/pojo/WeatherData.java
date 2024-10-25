package com.app.weather.model.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class WeatherData {
    // attributes
    private String city_name;
    private String country_code;
    private double temp;
    private double app_temp;
    private String weather_description;

    @JsonProperty("wind_spd")
    private double windSpeed;
    @JsonProperty("rh")
    private int humidity;
    @JsonProperty("aqi")
    private double aqi;
    @JsonProperty("ob_time")
    private String observationTime;
}
