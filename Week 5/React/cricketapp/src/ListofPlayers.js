import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 105 },
    { name: 'Rohit Sharma', score: 65 },
    { name: 'MS Dhoni', score: 85 },
    { name: 'KL Rahul', score: 45 },
    { name: 'Hardik Pandya', score: 75 },
    { name: 'Shikhar Dhawan', score: 30 },
    { name: 'Rishabh Pant', score: 90 },
    { name: 'Ravindra Jadeja', score: 68 },
    { name: 'R Ashwin', score: 20 },
    { name: 'Jasprit Bumrah', score: 10 },
    { name: 'Mohammed Shami', score: 5 }
  ];

  const playersBelow70 = players.filter(player => player.score < 70);

  return (
    <div style={{ padding: '20px' }}>
      <h2>All Players (using map)</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players Below 70 (using filter)</h2>
      <ul>
        {playersBelow70.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
