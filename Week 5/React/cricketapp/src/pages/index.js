import Head from 'next/head';
import { useState } from 'react';
import ListofPlayers from '../ListofPlayers';
import IndianPlayers from '../IndianPlayers';

export default function Home() {
  const [flag, setFlag] = useState(true);

  return (
    <>
      <Head>
        <title>Cricket App</title>
      </Head>
      <main style={{ padding: '20px', fontFamily: 'sans-serif' }}>
        <button 
          onClick={() => setFlag(!flag)} 
          style={{ padding: '10px 20px', cursor: 'pointer', marginBottom: '20px', backgroundColor: '#0056b3', color: 'white', border: 'none', borderRadius: '4px' }}
        >
          Toggle Component
        </button>

        {flag ? <ListofPlayers /> : <IndianPlayers />}
      </main>
    </>
  );
}
