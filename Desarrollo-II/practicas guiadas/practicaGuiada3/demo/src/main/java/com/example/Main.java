package com.example;

import com.google.gson.Gson;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Diego", 18, 2, true);
        Gson gson = new Gson();
        PersonFileManager manager = new PersonFileManager();
        List<Person> people = manager.readAll();
        for (Person p : people) {
            System.out.println(p.getName());
        }


        String json = gson.toJson(person);
        System.out.println(json);
        /* 
        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(person, writer);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
        */

        /* 
        try (FileReader reader = new FileReader("person.json")){
            Type type = new TypeToken<ArrayList<Person>>() {}.getType();
            List<Person> people = gson.fromJson(reader, type);
            for (Person p : people) {
                System.out.println(p.getName());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        */

        
    }
}