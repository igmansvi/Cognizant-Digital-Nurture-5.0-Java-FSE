import '../Stylesheets/mystyle.css';

const CalculateScore = ({ Name, School, Total, goal }) => {
  const average = Total / goal;
  return (
    <div className="score-card">
      <h2>Student Score Details</h2>
      <p><b>Name:</b> {Name}</p>
      <p><b>School:</b> {School}</p>
      <p><b>Total:</b> {Total}</p>
      <p><b>Goal:</b> {goal}</p>
      <p><b>Average Score:</b> {average.toFixed(2)}</p>
    </div>
  );
};

export default CalculateScore;
