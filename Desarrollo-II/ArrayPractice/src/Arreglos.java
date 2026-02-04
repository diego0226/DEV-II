public class Arreglos {
    public static void main(String[] args) {
        int[] numeros = {50, 10, 300, 25, 15};
        //#1
        System.out.println("Numero más alto:");
        System.out.println(highNumber(numeros) + "\n");

        //#2
        System.out.println("Elevado al cuadrado");
        int[] squareArray = doubleArray(numeros);
        for (int i : squareArray) {
            System.out.println(i);
        }
        System.out.println();

        //#3
        System.out.println("Numero más bajo");
        System.out.println(lowNumber(numeros) + "\n");

        //#4
        System.out.println("suma de todos:");
        System.out.println(sum(numeros));

        //#5
        System.out.println("segundo más alto:");
        System.out.println(secondMax(numeros));
    }

    //#1
    public static int highNumber(int[] numeros) {
        int mayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    //#2
    public static int[] doubleArray(int[] array) {
        int[] squareArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squareArray[i] = array[i] * array[i];
        }
        return squareArray;
    }

    //#3
    public static int lowNumber(int[] numeros) {
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor  = numeros[i];
            }
        }
        return menor;
    }

    //#4
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    //#5
    public static int secondMax(int[] numeros) {
        int max = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == max){
                numeros[i] = 0;
            }
        }
        
        int secondMax = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > secondMax) {
                secondMax = numeros[i];
            }
        }
        return secondMax;
    }      
}
