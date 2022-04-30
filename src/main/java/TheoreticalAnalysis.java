import java.util.Arrays;

public class TheoreticalAnalysis {

    public static void main(String[] args) {
        int[] array = {2, 3 ,4, 6, 8};

        System.out.println("Mostrar el primer elemento del Array " + Arrays.toString(array) + ": "
                + firstElementOfArray(array) + "\n");

        System.out.println("Mostrar elementos de un Array: "
                + elementsOfArrayToString(array) + "\n");

        System.out.println("Pares ordenados de un Array:\n"
                 + orderedPairsInArray(array) + "\n");

        System.out.println("Imprimir dos veces un array:\n"
                + showArrayTwoTimes(array) + "\n");

        System.out.println("Búsqueda Lineal del número 6: Array["
                + linearSearch(array, 6) + "]");
    }

    public static int firstElementOfArray(int[] array) {
        return array[0]; // step 01: 1

        /*
            Total steps = 1
            a(1) <= T(n) <= b(1) -> O(1)
        */
    }


    public static String elementsOfArrayToString(int[] array) {
        String elements = ""; // step 01: 1
        for (int i = 0; i < array.length; i++) // step 02: n + 1
            elements += array[i] + " "; // step 03: n
        return elements; // step 04: 1

        /*
            Total steps = 2n + 3
            a(2n + 3) <= T(n) <= b(2n + 3) -> O(n)
        */
    }


    public static String orderedPairsInArray(int[] arreglo) {
        String orderedPair = ""; // step 01: 1
        for (int i = 0; i < arreglo.length; i++) { // step 02: n + 1
            for (int j = 0; j < arreglo.length; j++) { //step 03:  n^2 + n
                if (i != j) { // step 04: n^2
                    orderedPair += arreglo[i] + " - " + arreglo[j] + "\n"; // step 05:  n^2 - n
                }
            }
        }
        return orderedPair; // step 06: 1

        /*
            Total steps = 3n^2 + 2n + 2
            a(3n^2 + 2n + 2) <= T(n) <= b(3n^2 + 2n + 2) -> O(n^2)
        */
    }


    public static String showArrayTwoTimes(int[] array) {
        String auxArray = ""; // step 01: 1
        for (int i = 0; i < array.length; i++) // step 02: n + 1
            auxArray += array[i] + " "; // step 03: n

        auxArray += "\n" + auxArray; // step 04: 1
        return auxArray; // step 05: 1

        /*
            Total steps = 2n + 4
            a(2n + 4) <= T(n) <= b(2n + 4) -> O(n)
        */
    }

    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) { //step 01: n + 1
            if (array[i] == element) { // step 02: n
                return i; // step 03: 1
            }
        }
        return -1;//step 04: 1
        /*
            Total steps = 2n + 3
            a(2n + 3) <= T(n) <= b(2n + 3) -> O(n)
        */
    }

}
