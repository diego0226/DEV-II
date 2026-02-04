import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //values10();
        //average();
        //doubleArray();
        //array24();
        //arrayString();
        //countLetters();
        //countA();
        //detected();
        //matriz1();
        matriz2();

    }

    public static void values10() {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[10];
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the value: ");
            values[i] = sc.nextInt();
            
        }

        for (int i : values) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    public static void average() {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[5];
        int positive = 0;
        int countPositive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter the value: ");
            values[i] = sc.nextInt();
            if(values[i] > 0){
                countPositive++;
                positive = positive + values[i];
            }else if(values[i] < 0){
                negative++;
            }else{
                zero++;
            }

            sc.close();
        }

        int media = positive / countPositive;
        System.out.println("Media positives: " + media);
        System.out.println("Negative: " + negative);
        System.out.println("Zeros: " + zero);
    }

    public static void doubleArray() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int[] b = {11, 12, 13, 14, 15, 16, 17, 18, 19 ,20};
        int[] c = new int[20];

        int index = 0;
        for (int i = 0; i < 10; i++) {
            c[index++] = a[i];
            c[index++] = b[i];
        }

        for (int i : c) {
            System.out.print(i + " ");
        }
    }

    public static void array24() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] b = {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        int[] c = new int[a.length + b.length];
        int count = 0;
        for (int i = 0; i < 12; i += 3) {
            for (int j = 0; j < 3; j++) {
                c[count++] = a[i + j];
            }
            for (int j = 0; j < 3; j++) {
                c[count++] = b[i + j];
            }
        }
        
        for (int i : c) {
            System.out.print(i + " ");
        }
    }

    public static void arrayString(){
        //de menor a mayor da positivo
        //de mayor a menor da negativo
        String[] names = {"Rafa", "fausto", "keylor", "pablo", "aaron", "Diego", "Valeria", "Thom", "jered", "sebas"};
        boolean ascendente = true;
        boolean descendente = true;
        for (int i = 0; i < names.length - 1; i++) {
            if(names[i].compareTo(names[i + 1]) > 0) {
                ascendente = false;
            }

            if(names[i].compareTo(names[i + 1]) < 0) {
                descendente = false;
            }
        }

        if (descendente) {
            System.out.println("Ordenado descendente");
        }else if(ascendente) {
            System.out.println("Ordenado ascendente");
        }else {
            System.out.println("Desordenado");
        }
    }

    public static void countLetters(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Number of de letters: " + count);
        sc.close();
    }

    public static void countA(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Number of de letters: " + count);
        sc.close();
    }

    public static void detected(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine().toLowerCase().replace(" ", "");
        boolean palindromos = true;
        int last = input.length() - 1;

        for (int i = 0; i < input.length() - 1; i++) {
        if (input.charAt(i) != input.charAt(last - i)) {
            palindromos = false;
            break;
        }
        sc.close();
        }
        if (palindromos) {
            System.out.println("Es palíndromo");
        }else{
            System.out.println("No es ");
        }
    }

    public static void matriz1(){
        int[][] matriz  = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {1, 1, 1, 1},
                        {2, 2, 2, 2}};
        int rowSum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                rowSum =  rowSum + matriz[i][j];
            }
        }

        int columnSum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                columnSum =  columnSum + matriz[j][i];
            }
        }

        if (columnSum == rowSum) {
            System.out.println("La suma de filas y columnas es igual: " + rowSum);
        }else{
            System.out.println("Las sumas no son iguales");
        }
    }

    public static void matriz2(){
        int[][] matriz  = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {1, 1, 1, 1},
                            {2, 2, 2, 2}};

        int sumDiagonal = 0;
        int sumInverted = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumDiagonal += matriz[i][i];
        }
        int columna = matriz.length - 1;
        for (int i = 0; i < matriz.length; i++) {
            sumInverted += matriz[i][columna - i];
        }

        System.out.println("Suma diagonal: " + sumDiagonal);
        System.out.println("Suma diagonal Inversa: " + sumInverted);
        int diference = 0;
        if (sumDiagonal > sumInverted) {
            diference = sumDiagonal - sumInverted;
            System.out.println("Diferencia entre sumas: " + diference);
        }else {
            diference = sumInverted - sumDiagonal;
            System.out.println("Diferencia entre sumas: " + diference);
        }
    }
}