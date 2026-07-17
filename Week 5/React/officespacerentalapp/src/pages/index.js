import Head from 'next/head';
import OfficeSpace from '../OfficeSpace';

export default function Home() {
  return (
    <>
      <Head>
        <title>Office Space Rental</title>
      </Head>
      <main style={{ backgroundColor: '#f0f2f5', minHeight: '100vh' }}>
        <OfficeSpace />
      </main>
    </>
  );
}
