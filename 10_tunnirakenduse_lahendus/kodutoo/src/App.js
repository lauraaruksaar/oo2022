import { Route, Routes } from 'react-router-dom';
import './App.css';
import Navbar from './components/Navbar';
import Add from './pages/Add';
import Home from './pages/Home';
import Maintain from './pages/Maintain';

function App() {
  return (
    <div className="App">
     <Navbar />
      <Routes>
        <Route path="" element={<Home />}/>
        <Route path="lisa" element={<Add />}/>
        <Route path="halda" element={<Maintain />}/>
      </Routes>
    </div>
  );
}

export default App;
