import type { Movie } from "../../models/movie.model";
import MovieCard from "./MovieCard";

export default function MoviesList(){
    const movies: Movie[] = [
        {
            id: "1",
            title: "The batman",
            description: "parte 1"
        },
        {
            id: "2",
            title: "Super man",
            description: "parte 1"
        },
    ];

    return (
        <div className="flex flex-col gap-4">
            {movies.map(movie =>(
                <MovieCard key={movie.id} {...movie} />
            ))}
        </div>
    );
}