import logo from './logo.svg';
import './App.css';
import Movies from './components/Movies';
import { Suspense } from 'react';
const DashBoard=lazy(()=> import('./components/DashBoard'))

function App() {
  return (
    <>
    <Movies />
    <Suspense fallback={<div>Loading...</div>}>
      <DashBoard />
    </Suspense>
    </>

  );
}

export default App;
