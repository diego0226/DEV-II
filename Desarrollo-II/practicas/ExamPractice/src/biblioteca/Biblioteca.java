package biblioteca;

public class Biblioteca {
    private Libro[] books;
    private int size;

    public Biblioteca() {
        books = new Libro[5];
        size = 0;
    }
    
    public int getSize() {
        return size;
    }

    public boolean add(Libro book){
        if (book != null && size < books.length) {
            books[size++] = book;
            return true;
        }
        return false;
    }

    public String show(){
        String result = "";
        if (size == 0) {
            return "[]";
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                result += books[i] + "\n";
            }else{
                result += "espacio disponible\n";
            }
        }
        return result;
    }

    public Libro searchISBN(int isbn){
        if (isbn > 0) {
            for (int i = 0; i < size; i++) {
                if (books[i].getIsbn() == isbn) {
                    return books[i];
                }
            }
        }
        return null;
    }

    public void bubbleSort(){
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j] != null && books[j + 1] != null) {
                    if (books[j].getPages() > books[j + 1].getPages()) {
                        Libro temp = books[j];
                        books[j] = books[j + 1];
                        books[j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Library sorted:");
    }

    public Libro searchBinary(int index){
        int first = 0;
        int last = size- 1;
        int middle = 0;
        while (first <= last) {
            middle = (first + last) / 2;
            if (books[middle].getPages() == index) {
                return books[middle];
            }else if (books[middle].getPages() < index) {
                first = middle + 1;
            }else {
                last = middle - 1;
            }
        }
        return null;
    }
}
