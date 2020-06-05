import React, {useState, useCallback} from 'react';
import './App.css';
import {load, loadCached} from "./client";

const Version = ({ version }) => {
  console.log(version)
  return (
    <p>{version}</p>
  );
};

const App = () => {
  const [value, setValue] = useState('init');

  const processMessage = useCallback(({ message }) => setValue(message));

  return (
    <div className="App">
      <header className="App-header">
        <Version version={value} />
        <button onClick={() => loadCached().then(processMessage)}>load with caching</button>
        <button onClick={() => load().then(processMessage)}>load without caching</button>
      </header>
    </div>
  );
};

export default App;
