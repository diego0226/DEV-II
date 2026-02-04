package arrayObjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro[] carros = {new Carro("Corvette"), new Carro("Ford"), new Carro("Dodge")};
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        Producto[] productos = {new Producto("leche", 100), new Producto("arroz", 50)};
        System.out.print("Ingrese el nombre del producto a buscar: ");
        System.out.println(Service.search(sc.nextLine(), productos));
        sc.close();
    }

}
