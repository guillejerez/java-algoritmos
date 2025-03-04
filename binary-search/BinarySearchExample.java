public class BinarySearchExample {

    // Método que realiza la búsqueda binaria en un arreglo ordenado
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            // Calcular el índice del elemento del medio
            int mid = low + (high - low) / 2;

            // Si el elemento del medio es el que buscamos, lo encontramos
            if (array[mid] == target) {
                return mid;
            }
            // Si el elemento del medio es menor que el target, ignoramos la mitad inferior
            else if (array[mid] < target) {
                low = mid + 1;
            }
            // Si el elemento del medio es mayor, ignoramos la mitad superior
            else {
                high = mid - 1;
            }
        }
        // Si salimos del bucle, significa que el target no está en el arreglo
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int target = 7;

        int result = binarySearch(numbers, target);
        if (result != -1) {
            System.out.println("El elemento " + target + " se encuentra en el indice: " + result);
        } else {
            System.out.println("El elemento " + target + " no se encuentra en el arreglo.");
        }
    }
}
