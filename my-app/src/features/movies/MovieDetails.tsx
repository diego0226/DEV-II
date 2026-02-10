import { useParams, Link } from "react-router-dom";
export default function MovieDetails() {
    const { id } = useParams<{ id: string }>();

    return (
        <section className="max-w-4xl mx-auto py-10 px-4">
            
            <Link
                to="/movies"
                className="text-blue-600 hover:underline mb-6 inline-block"
            >
                ← Back to movies
            </Link>

            <div className="bg-white rounded-xl shadow-md p-8">
                
                <h1 className="text-3xl font-bold text-gray-800 mb-4">
                    Movie Details
                </h1>

                <p className="text-gray-600 text-lg">
                    Movie ID: <span className="font-medium text-gray-800">{id}</span>
                </p>

            </div>

        </section>
    );
}
