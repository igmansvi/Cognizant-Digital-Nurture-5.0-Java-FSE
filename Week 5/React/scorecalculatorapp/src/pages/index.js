import CalculateScore from '../Components/CalculateScore';

export default function Home() {
  return (
    <main style={{ minHeight: '100vh', padding: '2rem', display: 'flex', justifyContent: 'center', alignItems: 'center' }}>
      <CalculateScore Name="John Doe" School="Cognizant Academy" Total={450} goal={5} />
    </main>
  );
}
