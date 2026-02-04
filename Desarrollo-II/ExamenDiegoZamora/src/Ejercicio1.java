public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4},
                        {2, 6, 7, 8},
                        {8, 10, 2, 12},
                        {13, 14, 15, 2}};
        int numBuscar = 2;
        System.out.println("El numero " + numBuscar + " se encontró en:");
        search(matriz, numBuscar);
        
    }

    public static void search(int[][] m, int num){
        int found = 0;
        int posicionI;
        int posicionJ;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] == num) {
                    posicionI = i;
                    posicionJ = j;
                    System.out.println("Posición: (" + posicionI + "," + posicionJ + ")");
                    found++;
                }
            }
        }

        System.out.println("Total encontradas: " + found);
    }

}
