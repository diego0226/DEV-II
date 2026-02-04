public class Ejercicio2 {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,2,2,2,2};
        int[] b = {3,3,3,3,5,5,5,5};
        dividir(a, b);
    }

    public static void dividir(int[] a, int b[]){
        int newSize = a.length / 2;
        int[] a1 = new int [newSize];
        int[] a2 = new int [newSize];

        int[] b1 = new int [newSize];
        int[] b2 = new int [newSize];
        //estos 4 for son para hacer las divisiones de los arreglos
        int numPass = 0;
        for (int i = 0; i < a1.length; i++) {
            a1[i] = a[i];
            numPass++;
        }

        for (int i = 0; i < a1.length; i++) {
            a2[i] = a[numPass];
            numPass++;
        }

        numPass = 0;
        for (int i = 0; i < a1.length; i++) {
            b1[i] = b[i];
            numPass++;
        }

        for (int i = 0; i < a1.length; i++) {
            b2[i] = b[numPass];
            numPass++;
        }

        //estos for son para sacar las sumas
        int sumA1 = 0;
        for (int i = 0; i < a1.length; i++) {
            sumA1 += a1[i];
        }

        int sumA2 = 0;
        for (int i = 0; i < a2.length; i++) {
            sumA2 += a2[i];
        }
        
        int sumB1 = 0;
        for (int i = 0; i < b1.length; i++) {
            sumB1 += b1[i];
        }

        int sumB2 = 0;
        for (int i = 0; i < b2.length; i++) {
            sumB2 += b2[i];
        }
        
        //calcular el total de la suma de las mitades
        int sumA1B1 = sumA1 + sumB2;
        int sumaA2B2 = sumA2 + sumB1;

        System.out.println("Primera mitad del primer areglo con segunda mitad del segundo arreglo su suma es de: " + sumA1B1);
        System.out.println("Segunda mitad del primer arreglo con la primera mitad del segundo arreglo: " + sumaA2B2);

        if (sumA1B1 > sumaA2B2) {
            System.out.println("La suma de la primera mitad del primer arreglo con la segunda mitad del segundo arreglo es mayor ");
        }else if (sumA1B1 > sumaA2B2) {
            System.out.println("La suma de la segunda mitad del primer arreglo con la primera mitad del segundo arreglo es mayor ");
        }else{
            System.out.println("Son iguales");
        }
    }
}
