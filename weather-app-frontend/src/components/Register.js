import React, { useContext, useState } from 'react';
import { AuthContext } from './AuthContext';

const Register = () => {
    const { register, error } = useContext(AuthContext);
    const [firstName, setFirstName] = useState('');
    const [lastName, setLastName] = useState('');
    const [country, setCountry] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        register(firstName, lastName, country, email, password);
    };

    return (
        <form onSubmit={handleSubmit}>
            <h2>Register</h2>
            <input type="text" placeholder="First Name" value={firstName} onChange={(e) => setFirstName(e.target.value)} required />
            <input type="text" placeholder="Last Name" value={lastName} onChange={(e) => setLastName(e.target.value)} required />
            <input type="email" placeholder="Email" value={email} onChange={(e) => setEmail(e.target.value)} required />
            <input type="password" placeholder="Password" value={password} onChange={(e) => setPassword(e.target.value)} required />
            <input type="text" placeholder="Country" value={country} onChange={(e) => setCountry(e.target.value)} required />
            <button type="submit">Register</button>
            {error && <p>{error}</p>}
        </form>
    );
};

export default Register;
