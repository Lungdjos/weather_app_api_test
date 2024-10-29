import React, { createContext, useState } from 'react';
import { loginUser, registerUser } from '../api/api'; // Adjust the path as necessary

export const AuthContext = createContext();

const AuthProvider = ({ children }) => {
    const [user, setUser] = useState(null);
    const [error, setError] = useState('');

    const login = async (email, password) => {
        try {
            const response = await loginUser(email, password);
            setUser(response.data); // Adjust according to your response structure
        } catch (err) {
            setError('Login failed. Please check your credentials.');
        }
    };

    const register = async (firstName, lastName, country, email, password) => {
        try {
            await registerUser(firstName, lastName, country, email, password);
            // Optionally auto-login after registration
            await login(email, password);
        } catch (err) {
            setError('Registration failed. Please try again.');
        }
    };

    return (
        <AuthContext.Provider value={{ user, login, register, error }}>
            {children}
        </AuthContext.Provider>
    );
};

export default AuthProvider;
