import { useEffect, useState } from "react";
import { useParams, Link } from "react-router-dom";
import type { Movie } from "../../models/movie.model";
import { getMoviesById } from "../../services/movies.service";

export default function MovieDetails() {
  const { id } = useParams<{ id: string }>();
  const [movie, setMovie] = useState<Movie | null>(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    if (!id) return;
    getMoviesById(id)
      .then((movie) => setMovie(movie))
      .finally(() => setLoading(false));
  }, [id]);

  if (loading) {
    return (
      <div className="flex items-center justify-center min-h-[60vh] text-gray-600 text-lg">
        🎬 Cargando película...
      </div>
    );
  }

  if (!movie) {
    return (
      <div className="flex flex-col items-center justify-center min-h-[60vh] text-gray-800">
        <h2 className="text-2xl font-bold mb-4 text-red-500">Película no encontrada</h2>
        <Link to="/movies" className="text-blue-600 hover:underline">
          ← Volver al listado
        </Link>
      </div>
    );
  }

  return (
    <section className="flex justify-center px-4">
      {/* Card compacta */}
      <div className="bg-white rounded-3xl shadow-xl max-w-3xl w-full overflow-hidden">

        {/* Imagen superior */}
        <div className="relative h-64 md:h-80">
          <img
            src={movie.img}
            alt={movie.title}
            className="w-full h-full object-cover"
          />
        </div>

        {/* Contenido */}
        <div className="p-6 md:p-8">
          <Link to="/movies" className="text-sm text-blue-600 hover:underline">
            ← Volver al listado
          </Link>

          <h1 className="text-3xl font-bold mt-3">{movie.title}</h1>

          <div className="flex flex-wrap items-center gap-2 mt-2">
            <span className="bg-yellow-400 text-black px-3 py-1 rounded-full font-semibold">
              ⭐ {movie.rating}
            </span>
            <span className="bg-gray-200 px-3 py-1 rounded-full text-gray-800">
              {movie.year}
            </span>
            <span className="bg-gray-200 px-3 py-1 rounded-full text-gray-800">
              {movie.genre}
            </span>
            {movie.duration && (
              <span className="bg-gray-200 px-3 py-1 rounded-full text-gray-800">
                ⏱ {movie.duration} min
              </span>
            )}
          </div>

          {movie.description && (
            <p className="mt-4 text-gray-700 leading-relaxed line-clamp-4">
              {movie.description}
            </p>
          )}

          <div className="mt-6 flex flex-col md:flex-row md:justify-between items-start md:items-center gap-4">
            <div className="space-y-2 text-gray-600 text-sm">
              {movie.director && (
                <p>
                  <span className="font-medium text-gray-800">Director:</span>{" "}
                  {movie.director}
                </p>
              )}
              <p>
                <span className="font-medium text-gray-800">ID:</span> {movie.id}
              </p>
            </div>

            <button className="bg-red-600 hover:bg-red-700 transition-all duration-300 px-6 py-3 rounded-full text-lg font-semibold shadow-md hover:scale-105">
              ▶ Ver ahora
            </button>
          </div>
        </div>
      </div>
    </section>
  );
}
