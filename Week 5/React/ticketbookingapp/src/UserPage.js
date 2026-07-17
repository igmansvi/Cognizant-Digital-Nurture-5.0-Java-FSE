import React from 'react';

const UserPage = ({ onLogout }) => {
  return (
    <div style={{ padding: '20px', border: '1px solid #ccc', margin: '20px', borderRadius: '8px' }}>
      <h2>Welcome back, User!</h2>
      <p>You can now book your tickets for the following flights:</p>
      <ul style={{ listStyleType: 'none', padding: 0 }}>
        <li style={{ margin: '10px 0' }}>Flight 101 - New York to London <button style={{ marginLeft: '10px', cursor: 'pointer' }}>Book</button></li>
        <li style={{ margin: '10px 0' }}>Flight 202 - Paris to Tokyo <button style={{ marginLeft: '10px', cursor: 'pointer' }}>Book</button></li>
        <li style={{ margin: '10px 0' }}>Flight 303 - Sydney to Los Angeles <button style={{ marginLeft: '10px', cursor: 'pointer' }}>Book</button></li>
      </ul>
      <br />
      <button onClick={onLogout} style={{ padding: '10px 20px', cursor: 'pointer', backgroundColor: '#dc3545', color: 'white', border: 'none', borderRadius: '4px' }}>Logout</button>
    </div>
  );
};

export default UserPage;
