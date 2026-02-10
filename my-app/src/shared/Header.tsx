export default function header(){
    return (
        <div className="bg-blue-600 text-white px-6 py-4 flex items-center justify-between shadow-md">
            <h1 className="text-2xl font-bold tracking-wide">The Movies</h1>
            <nav className="flex gap-6">
                <a href="/movies" className="hover:text-blue-200 transition-colors duration-200">Movies</a>
            </nav>
            
        </div>
    );
}