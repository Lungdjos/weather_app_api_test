package com.app.weather.model.pojo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForecastData {
    // attributes
    private String datetime;

    @JsonProperty("max_temp")
    private double maxTemp;
    @JsonProperty("min_temp")
    private double minTemp;
    private String weather_description;
    private double precip;
    private double uv;

    @JsonProperty("wind_cdir_full")
    private String windDirection;
    @JsonProperty("wind_spd")
    private double windSpeed;
}
