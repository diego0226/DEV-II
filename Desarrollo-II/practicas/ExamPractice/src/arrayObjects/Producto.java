package arrayObjects;

public class Producto {
    private String name;
    private int price;

    public Producto(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Producto [name= " + name + ", price= " + price + "]";
    }
    

}
