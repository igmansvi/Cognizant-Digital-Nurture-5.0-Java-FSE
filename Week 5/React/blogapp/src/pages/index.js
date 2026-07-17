import Head from "next/head";
import Posts from "../Posts";

export default function Home() {
  return (
    <>
      <Head>
        <title>Blog App</title>
        <meta name="description" content="Blog app using React class components" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="icon" href="/favicon.ico" />
      </Head>
      <main style={{ maxWidth: '800px', margin: '0 auto', fontFamily: 'sans-serif' }}>
        <Posts />
      </main>
    </>
  );
}
