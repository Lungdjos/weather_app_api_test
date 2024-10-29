# weather_application_api_challenge

Code Challenge: Weather Application Using Weatherbit API
Overview
In this challenge, you'll build a weather application that fetches current weather data and a 16-day weather forecast for a city using the Weatherbit API. The goal is to create a functional full-stack web application that provides users with accurate weather information.
You can use any programming language or framework for both the front-end and back-end. You will be evaluated on the functionality, design, and code quality.
API Documentation:
Base URL: https://api.weatherbit.io/v2.0
Current Weather: /current
16-day Forecast: /forecast/daily
Tasks
1. Current Weather Display
Create an interface where users can input a city name and country code.
Fetch and display the current weather for the entered city using the Weatherbit API.
Display relevant information, including but not limited to:
Temperature (temp)
Feels like temperature (app_temp)
Weather description (weather.description)
Wind speed (wind_spd)
Humidity (rh)
Air quality index (aqi)
City name (city_name), Country code (country_code)
Timestamp of the observation (ob_time)
2. 16-day Weather Forecast
Provide a section that allows users to view the 16-day forecast for the selected city.
Display key data points for each day, such as:
Date (datetime)
Maximum temperature (max_temp)
Minimum temperature (min_temp)
Weather description (weather.description)
Precipitation (precip)
UV index (uv)
Wind direction (wind_cdir_full) and speed (wind_spd)
3. Search History & Persistence
Keep a history of the last 5 cities searched, allowing users to easily revisit past searches.
Store this history in a database or local storage (any DB you choose).
Display the search history in the user interface.
4. Responsive Design
Ensure the application is responsive and works on both desktop and mobile devices.
Instructions
Environment Setup:
Set up a basic full-stack web application. The backend should handle the API calls to Weatherbit, and the frontend should display the data.
API Integration:
Sign up for an API key at Weatherbit.
Use this API key to make requests to the /current and /forecast/daily endpoints.
Frontend Requirements:
Provide a simple, clean user interface for interacting with the application.
Use a framework/library of your choice (React, Vue, Angular, plain HTML/CSS/JS, etc.).
Display weather data in a visually appealing way, making use of charts or icons where applicable.
Backend Requirements:
The backend should be responsible for calling the Weatherbit API and serve the data to the frontend.
Use any language or framework (Node.js, Python, Ruby, PHP, Java, etc.).
Ensure that error handling is in place for failed API calls or invalid city inputs.
Bonus:
Implement user authentication so users can save their favorite cities.
Use caching to reduce the number of API calls (e.g., cache weather data for a city for 10 minutes).
Use of pagination
What to Submit:
A link to your GitHub repository with the following:
A README.md file explaining how to set up and run your project.
A clear description of the technologies used.
Any additional instructions for using the API (e.g., where to add the API key).
Optionally, a live demo link if hosted.
Evaluation Criteria:
Functionality: Does the app work as expected? Are all required features implemented?
Code Quality: Is the code well-structured, maintainable, and documented?
UI/UX: Is the user interface intuitive and responsive?
Bonus Features: Implementation of caching, authentication, or deployment will add to your score.
Good luck!
