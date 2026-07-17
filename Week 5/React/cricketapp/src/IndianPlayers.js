import React from 'react';

const IndianPlayers = () => {
  const T20players = ['First T20 Player', 'Second T20 Player', 'Third T20 Player'];
  const RanjiTrophyPlayers = ['First Ranji Player', 'Second Ranji Player', 'Third Ranji Player'];
  
  // Merge using ES6 spread
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  // Destructuring Odd and Even from array
  const [odd1, even1, odd2, even2, odd3, even3] = mergedPlayers;

  return (
    <div style={{ padding: '20px' }}>
      <h2>Indian Players (Merged Array)</h2>
      <ul>
        {mergedPlayers.map((p, i) => <li key={i}>{p}</li>)}
      </ul>
      
      <h2>Odd Team Players (via Destructuring)</h2>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        <li>{odd3}</li>
      </ul>

      <h2>Even Team Players (via Destructuring)</h2>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        <li>{even3}</li>
      </ul>
    </div>
  );
};

export default IndianPlayers;
