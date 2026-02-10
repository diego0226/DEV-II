import type { Movie } from "../../models/movie.model";
import { Link } from "react-router-dom";

export default function MovieCard({ id, title, description }: Movie) {
    return (
        <Link
            to={`/movies/${id}`}
            className="bg-white rounded-xl shadow-md p-5 hover:shadow-lg hover:-translate-y-1 transition-all duration-200"
        >
            <h3 className="text-xl font-semibold text-gray-800 mb-2">
                {title}
            </h3>

            <p className="text-gray-600 text-sm">
                {description}
            </p>
        </Link>
    );
}
