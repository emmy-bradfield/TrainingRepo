import React from 'react';
import ReactDOM from 'react-dom/client';
import { render } from "react-dom";
import './App.css';
import Calendar from './components/calendar.jsx';
import data from './data/events.json';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <Calendar shindigs={data} />
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
