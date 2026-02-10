import { Link } from "react-router-dom";
import MoviesList from "./MoviesList";

export default function Movies() {
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

      <MoviesList />
    </section>
  );
}
