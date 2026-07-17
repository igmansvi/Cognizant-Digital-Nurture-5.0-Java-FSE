import Head from 'next/head';
import { useState } from 'react';
import { BookDetails, BlogDetails, CourseDetails } from '../DetailsComponents';

export default function Home() {
  const [view, setView] = useState('book'); // 'book', 'blog', or 'course'

  // Method 1: If-Else Statement
  const renderDetailsWithIfElse = () => {
    if (view === 'book') {
      return <BookDetails />;
    } else if (view === 'blog') {
      return <BlogDetails />;
    } else if (view === 'course') {
      return <CourseDetails />;
    }
    return null;
  };

  return (
    <>
      <Head>
        <title>Blogger App</title>
      </Head>
      <main style={{ maxWidth: '800px', margin: '0 auto', padding: '20px', fontFamily: 'sans-serif' }}>
        <h1 style={{ textAlign: 'center' }}>Blogger Portal</h1>
        
        <div style={{ display: 'flex', justifyContent: 'center', gap: '10px', marginBottom: '20px' }}>
          <button onClick={() => setView('book')} style={{ padding: '10px', cursor: 'pointer', backgroundColor: view === 'book' ? '#0070f3' : '#ccc', color: view === 'book' ? 'white' : 'black', border: 'none', borderRadius: '4px' }}>Show Book</button>
          <button onClick={() => setView('blog')} style={{ padding: '10px', cursor: 'pointer', backgroundColor: view === 'blog' ? '#0070f3' : '#ccc', color: view === 'blog' ? 'white' : 'black', border: 'none', borderRadius: '4px' }}>Show Blog</button>
          <button onClick={() => setView('course')} style={{ padding: '10px', cursor: 'pointer', backgroundColor: view === 'course' ? '#0070f3' : '#ccc', color: view === 'course' ? 'white' : 'black', border: 'none', borderRadius: '4px' }}>Show Course</button>
        </div>

        <h2>Method 1: If-Else Rendering</h2>
        {renderDetailsWithIfElse()}

        <hr style={{ margin: '30px 0', border: '0', borderTop: '1px solid #eaeaea' }} />

        <h2>Method 2: Ternary Operator (? :)</h2>
        {view === 'book' ? (
          <BookDetails />
        ) : view === 'blog' ? (
          <BlogDetails />
        ) : view === 'course' ? (
          <CourseDetails />
        ) : null}

        <hr style={{ margin: '30px 0', border: '0', borderTop: '1px solid #eaeaea' }} />

        <h2>Method 3: Logical AND (&&)</h2>
        {view === 'book' && <BookDetails />}
        {view === 'blog' && <BlogDetails />}
        {view === 'course' && <CourseDetails />}

      </main>
    </>
  );
}
