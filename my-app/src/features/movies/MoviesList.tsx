import type { Movie } from "../../models/movie.model";
import MovieCard from "./MovieCard";

export default function MoviesList({ movies }: {movies :Movie[]}){

    return (
        <div className="grid gap-6 sm:grid-cols-2 md:grid-cols-3">
            {movies.map(movie => (
                <MovieCard key={movie.id} {...movie} />
            ))}
        </div>
    );
}
