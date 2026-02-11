import type { User } from "../../models/user.model";
interface ProfileCardProps {
  user: User;
}
export default function ProfileCard({ user }: ProfileCardProps) {
  return (
    <div className="bg-white rounded-xl shadow-md p-5 hover:shadow-lg transition-all duration-200">
      {" "}
      <img
        src={user.img || "https://via.placeholder.com/150"}
        alt={user.name}
        className="w-full h-48 object-cover rounded-lg mb-4"
      />{" "}
      <h3 className="text-xl font-semibold">{user.name}</h3>{" "}
      <p className="text-gray-600">@{user.userName}</p>{" "}
      {user.email && <p className="text-gray-500 text-sm">{user.email}</p>}{" "}
    </div>
  );
}
