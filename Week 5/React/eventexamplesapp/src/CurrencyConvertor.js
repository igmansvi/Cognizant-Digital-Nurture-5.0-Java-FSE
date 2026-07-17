import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    const rate = 85; // approx conversion rate INR to EUR
    setEuros((parseFloat(rupees) / rate).toFixed(2));
  };

  return (
    <div style={{ padding: '20px' }}>
      <h2>Currency Convertor (INR to EUR)</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Amount in INR:
          <input 
            type="number" 
            value={rupees} 
            onChange={(e) => setRupees(e.target.value)} 
            style={{ marginLeft: '10px', marginRight: '10px' }}
          />
        </label>
        <button type="submit">Convert</button>
      </form>
      {euros !== null && (
        <p style={{ marginTop: '15px' }}>
          Equivalent in Euros: &euro; {euros}
        </p>
      )}
    </div>
  );
};

export default CurrencyConvertor;
