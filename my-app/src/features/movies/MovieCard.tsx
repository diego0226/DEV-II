import type { Movie } from "../../models/movie.model";
import { Link } from "react-router-dom";

export default function MovieCard(props: Movie) {
  return (
    <Link
      to={`/movies/${props.id}`}
      className="block bg-white rounded-2xl shadow-md overflow-hidden
                 hover:shadow-xl hover:-translate-y-1 
                 transition-all duration-300"
    >
      <img
        src={props.img}
        alt={props.title}
        className="w-full h-60 object-cover"
      />

      <div className="p-5">
        <h3 className="text-xl font-bold text-gray-800 mb-2">{props.title}</h3>

        <p className="text-sm text-gray-500">
          {props.year} • {props.genre}
        </p>

        <p className="text-yellow-500 font-semibold mt-1">⭐ {props.rating}</p>

        {props.description && (
          <p className="text-gray-600 text-sm mt-2 line-clamp-2">
            {props.description}
          </p>
        )}

        <div className="flex justify-between items-center mt-3 text-xs text-gray-500">
          {props.duration && <span>⏱ {props.duration} min</span>}
          {props.director && <span>Dir. {props.director}</span>}
        </div>
      </div>
    </Link>
  );
}
