import React from 'react';

const GuestPage = ({ onLogin }) => {
  return (
    <div style={{ padding: '20px', border: '1px solid #ccc', margin: '20px', borderRadius: '8px' }}>
      <h2>Welcome, Guest!</h2>
      <p>Browse our flight details below:</p>
      <ul>
        <li>Flight 101 - New York to London</li>
        <li>Flight 202 - Paris to Tokyo</li>
        <li>Flight 303 - Sydney to Los Angeles</li>
      </ul>
      <p style={{ color: 'red', fontWeight: 'bold' }}>Please login to book tickets.</p>
      <button onClick={onLogin} style={{ padding: '10px 20px', cursor: 'pointer', backgroundColor: '#28a745', color: 'white', border: 'none', borderRadius: '4px' }}>Login</button>
    </div>
  );
};

export default GuestPage;
