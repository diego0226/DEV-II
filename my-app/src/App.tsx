import { BrowserRouter, Route, Routes } from 'react-router-dom'
import './App.css'

import NotFound from './shared/NotFound';
import Header from './shared/Header';
import Home from './features/home/Home';
import Footer from './shared/Footer';
import Movies from './features/movies/Movies';
import MovieDetails from './features/movies/MovieDetails';
import Profile from './features/profile/Profile';

function App() {
  return (
    <BrowserRouter>
      <div className="min-h-screen flex flex-col bg-gradient-to-br from-blue-300 via-purple-200 to-indigo-100">
        <Header />

        <main className="flex-grow px-6 py-8">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/home" element={<Home />} />
            <Route path="/movies" element={<Movies />} />
            <Route path="/movies/:id" element={<MovieDetails />} />
            <Route path="/profile" element={<Profile />} />
            <Route path="*" element={<NotFound />} />
          </Routes>
        </main>

        <Footer />
      </div>
    </BrowserRouter>
  );
}

export default App;
