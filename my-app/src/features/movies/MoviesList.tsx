import type { Movie } from "../../models/movie.model";
import MovieCard from "./MovieCard";

export default function MoviesList() {
    const movies: Movie[] = [
        {
            id: "TheBatman",
            title: "The Batman",
            description: "Parte 1"
        },
        {
            id: "SuperMan",
            title: "Superman",
            description: "Parte 1"
        },
        {
            id: "FastAndFurios",
            title: "Fast and Furios",
            description: "Street race"
        },
        {
            id: "Cars1",
            title: "Cars 1",
            description: "cars"
        }
    ];

    return (
        <div className="grid gap-6 sm:grid-cols-2 md:grid-cols-3">
            {movies.map(movie => (
                <MovieCard key={movie.id} {...movie} />
            ))}
        </div>
    );
}
