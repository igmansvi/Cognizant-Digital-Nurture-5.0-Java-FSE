import Head from "next/head";
import CohortDetails from "../CohortDetails";

export default function Home() {
  const cohorts = [
    { name: 'Java Full Stack', startDate: '2023-01-01', endDate: '2023-06-01', status: 'ongoing' },
    { name: 'React Deepskilling', startDate: '2022-01-01', endDate: '2022-03-01', status: 'completed' }
  ];

  return (
    <>
      <Head>
        <title>Cohort Details</title>
      </Head>
      <main style={{ padding: '20px' }}>
        {cohorts.map((cohort, index) => (
          <CohortDetails key={index} cohort={cohort} />
        ))}
      </main>
    </>
  );
}
