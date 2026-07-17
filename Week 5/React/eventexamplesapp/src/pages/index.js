import Head from 'next/head';
import EventDemo from '../EventDemo';
import CurrencyConvertor from '../CurrencyConvertor';

export default function Home() {
  return (
    <>
      <Head>
        <title>Event Examples App</title>
      </Head>
      <main style={{ padding: '20px', fontFamily: 'sans-serif' }}>
        <EventDemo />
        <CurrencyConvertor />
      </main>
    </>
  );
}
