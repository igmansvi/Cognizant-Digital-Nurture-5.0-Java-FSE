import React from 'react';

const OfficeSpace = () => {
  const offices = [
    { id: 1, name: 'Downtown Hub', rent: 55000, address: '123 Downtown St', image: 'https://via.placeholder.com/150/0000FF/808080 ?Text=Office1' },
    { id: 2, name: 'Tech Park', rent: 75000, address: '456 Tech Blvd', image: 'https://via.placeholder.com/150/FF0000/FFFFFF ?Text=Office2' },
    { id: 3, name: 'Suburban Office', rent: 40000, address: '789 Suburb Ave', image: 'https://via.placeholder.com/150/FFFF00/000000 ?Text=Office3' },
    { id: 4, name: 'City Center', rent: 85000, address: '101 City Center', image: 'https://via.placeholder.com/150/000000/FFFFFF ?Text=Office4' }
  ];

  return (
    <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
      <h1 style={{ color: '#333' }}>Office Space Rental Portal</h1>
      <div style={{ display: 'flex', flexWrap: 'wrap', gap: '20px' }}>
        {offices.map(office => (
          <div key={office.id} style={{ border: '1px solid #ccc', borderRadius: '8px', padding: '15px', width: '250px', backgroundColor: '#fff', boxShadow: '0 2px 4px rgba(0,0,0,0.1)' }}>
            <img src={office.image} alt={office.name} style={{ width: '100%', height: '150px', objectFit: 'cover', borderRadius: '4px' }} />
            <h3 style={{ marginTop: '10px' }}>{office.name}</h3>
            <p style={{ color: '#555' }}>Address: {office.address}</p>
            <p style={{ color: office.rent < 60000 ? 'red' : 'green', fontWeight: 'bold', fontSize: '18px' }}>
              Rent: Rs. {office.rent}
            </p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default OfficeSpace;
