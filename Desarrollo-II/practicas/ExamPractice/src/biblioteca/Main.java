package biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();

        biblio.add(new Libro(1, "Info", "Diego", 10));
        biblio.add(new Libro(2, "Carreras", "Andres", 15));
        biblio.add(new Libro(3, "Desarrollo", "Angelica", 7));

        Libro encontrado = biblio.searchISBN(2);
        if (encontrado != null) {
            System.out.println("Book found: " + encontrado);
        }else{
            System.out.println("No found");
        }

        biblio.bubbleSort();
        System.out.println(biblio.show());
        System.out.println(biblio.searchBinary(15));
        

    }
    
}
