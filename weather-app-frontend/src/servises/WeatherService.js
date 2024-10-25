// src/services/WeatherService.js

import { fetchCurrentWeather, fetchForecast } from '../api/api';

class WeatherService {
    // Method to get current weather
    async getCurrentWeather(city, country) {
        try {
            const data = await fetchCurrentWeather(city, country);
            return data;
        } catch (error) {
            throw new Error('Failed to fetch current weather: ' + error.message);
        }
    }

    // Method to get 16-day weather forecast
    async getForecast(city, country) {
        try {
            const data = await fetchForecast(city, country);
            return data;
        } catch (error) {
            throw new Error('Failed to fetch weather forecast: ' + error.message);
        }
    }
}

export default new WeatherService();
