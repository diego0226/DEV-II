import type { User } from "../models/user.model";

const USER_URL = "/data/user.json"; // Debe estar en public/data/user.json

export async function getUsers(): Promise<User[]> {
  const response = await fetch(USER_URL);
  if (!response.ok) {
    throw new Error(`No se pudo cargar user.json (status ${response.status})`);
  }

  const data = await response.json();
  return data as User[];
}
