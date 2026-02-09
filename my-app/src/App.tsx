import { BrowserRouter, Route, Router, Routes } from 'react-router-dom'
import './App.css'

import NotFound from './shared/NotFound';
import Header from './shared/Header';
import Home from './features/home/Home';
import Footer from './shared/Footer';
import Movies from './features/movies/Movies';
import MovieDetails from './features/movies/MovieDetails';

function App() {
  return (
    <BrowserRouter>
    <Header />

    <main>
      <Routes>
        <Route path ="/" element={<Home/>} />
        <Route path ="/home" element={<Home/>} />
        <Route path ="/movies" element={<Movies/>} />
        <Route path="/movies/:id" element={<MovieDetails/>}/>

        <Route path ="*" element={<NotFound/>} />
        
      </Routes>
    </main>


    <Footer/>
    </BrowserRouter>
  );
}

export default App
