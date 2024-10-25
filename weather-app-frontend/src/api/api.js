import axios from 'axios';

const API_URL = 'http://localhost:8080/api'; // Adjust according to your backend URL

// Function to register a new user
export const registerUser = async (email, password) => {
    const response = await axios.post(`${API_URL}/register`, {firstName, lastName, email, password, country });
    return response.data;
};

// Function to log in a user
export const loginUser = async (email, password) => {
    const response = await axios.post(`${API_URL}/login`, { email, password });
    return response.data;
};

// Function to fetch current weather
export const fetchCurrentWeather = async (city, country) => {
    const response = await axios.get(`${API_URL}/weather?city=${city}&country=${country}`);
    return response.data;
};

// Function to fetch the 16-day weather forecast
export const fetchForecast = async (city, country) => {
    const response = await axios.get(`${API_URL}/forecast?city=${city}&country=${country}`);
    return response.data;
};
