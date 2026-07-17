import Head from 'next/head';
import { useState } from 'react';
import GuestPage from '../GuestPage';
import UserPage from '../UserPage';

export default function Home() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <>
      <Head>
        <title>Ticket Booking App</title>
      </Head>
      <main style={{ fontFamily: 'sans-serif', maxWidth: '600px', margin: '0 auto' }}>
        <h1 style={{ textAlign: 'center', marginTop: '20px' }}>Flight Booking Portal</h1>
        {isLoggedIn ? (
          <UserPage onLogout={() => setIsLoggedIn(false)} />
        ) : (
          <GuestPage onLogin={() => setIsLoggedIn(true)} />
        )}
      </main>
    </>
  );
}
