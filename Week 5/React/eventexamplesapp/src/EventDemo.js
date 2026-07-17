import React, { useState } from 'react';

const EventDemo = () => {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(prev => prev + 1);
  };

  const sayHello = () => {
    alert("Hello! This is a static message.");
  };

  const handleIncrement = () => {
    increment();
    sayHello();
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleOnPress = (e) => {
    alert("I was clicked");
    console.log(e); // logging synthetic event
  };

  return (
    <div style={{ padding: '20px', borderBottom: '1px solid #ccc' }}>
      <h2>Event Examples</h2>
      <p>Counter: {count}</p>
      <button onClick={handleIncrement} style={{ marginRight: '10px' }}>Increment & Say Hello</button>
      <button onClick={decrement} style={{ marginRight: '10px' }}>Decrement</button>
      <button onClick={() => sayWelcome('Welcome')} style={{ marginRight: '10px' }}>Say Welcome</button>
      <button onClick={handleOnPress}>OnPress (Synthetic Event)</button>
    </div>
  );
};

export default EventDemo;
