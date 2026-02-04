package arrayObjects;

public class Service {
    public static Producto search(String name, Producto[] p){
        for (int i = 0; i < p.length; i++) {
            if (p[i].getName().equalsIgnoreCase(name)) {
                return p[i];
            }
        }

        return null;
    }

}
