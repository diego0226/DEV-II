package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PersonFileManager {

    // Según tu estructura: src/data/person.json
    private static final String PATH = "person.json";

    // Gson con formato bonito para el archivo
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // Tipo exacto para List<Person>
    private final Type listType = new TypeToken<ArrayList<Person>>() {}.getType();

    // -------------------- READ ALL --------------------
    public List<Person> readAll() {
        try (FileReader reader = new FileReader(PATH)) {
            List<Person> people = gson.fromJson(reader, listType);
            return (people == null) ? new ArrayList<>() : people;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // -------------------- WRITE ALL --------------------
    public void writeAll(List<Person> people) {
        try (FileWriter writer = new FileWriter(PATH)) {
            gson.toJson(people, listType, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // -------------------- INSERT --------------------
    public boolean insert(Person newPerson) {
        if (newPerson == null) return false;

        List<Person> people = readAll();

        boolean exists = people.stream().anyMatch(p -> p.getId() == newPerson.getId());
        if (exists) {
            System.out.println("Ya existe una persona con id: " + newPerson.getId());
            return false;
        }

        people.add(newPerson);
        writeAll(people);
        return true;
    }

    // -------------------- GET BY ID --------------------
    public Person getById(int id) {
        List<Person> people = readAll();

        for (Person p : people) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    // -------------------- UPDATE --------------------
    public boolean update(Person updatedPerson) {
        if (updatedPerson == null) return false;

        List<Person> people = readAll();

        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == updatedPerson.getId()) {
                people.set(i, updatedPerson);
                writeAll(people);
                return true;
            }
        }
        return false;
    }

    // -------------------- DELETE --------------------
    public boolean delete(int id) {
        List<Person> people = readAll();

        boolean removed = people.removeIf(p -> p.getId() == id);
        if (removed) {
            writeAll(people);
        }
        return removed;
    }
}
