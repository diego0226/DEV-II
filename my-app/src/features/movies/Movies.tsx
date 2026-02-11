import { Link } from "react-router-dom";
import MoviesList from "./MoviesList";
import { useEffect, useState } from "react";
import { getMovies } from "../../services/movies.service";
import type { Movie } from "../../models/movie.model";

export default function Movies() {
  const [movies, setMovies] = useState<Movie[]>([]);
  const [loading, setLoading] = useState(true);
  
  useEffect(() => {
    getMovies()
      .then(setMovies)
      .finally(() => setLoading(false));
    
    }, []);

    if (loading) {
      return(
        <div className="min-h-screen ">
          cargando....
        </div>
      );
      
    }
  return (
    <section className="max-w-6xl mx-auto px-4 md:px-6 py-8">
      <Link
        to="/"
        className="inline-flex items-center text-blue-600 hover:underline mb-4"
      >
        ← Back to home
      </Link>

      <header className="mb-6">
        <h1 className="text-3xl font-bold text-gray-800">Movies</h1>
        <p className="text-gray-600">Explore the list of available movies</p>
      </header>

      <MoviesList movies={movies}/>
      
    </section>
  );
}
