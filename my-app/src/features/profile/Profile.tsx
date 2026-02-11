import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import ProfileCard from "./ProfileCard";
import type { User } from "../../models/user.model";
import { getUsers } from "../../services/users.service";

export default function ProfileList() {
  const [users, setUsers] = useState<User[]>([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    getUsers()
      .then(setUsers)
      .finally(() => setLoading(false));
  }, []);

  if (loading) {
    return <div className="min-h-screen flex items-center justify-center">Cargando usuarios...</div>;
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
        <h1 className="text-3xl font-bold text-gray-800">Profile</h1>
      </header>

      <div className="grid sm:grid-cols-2 md:grid-cols-3 gap-6">
        {users.map((user) => (
          <ProfileCard key={user.userName} user={user} />
        ))}
      </div>
    </section>
  );
}
