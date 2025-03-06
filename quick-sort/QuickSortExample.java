
import java.util.Arrays;

public class QuickSortExample {

    // Método principal para ejecutar QuickSort en el arreglo
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Encuentra el indice de particion
            int pivotIndex = partition(arr, low, high);
            // Ordena recursivamente las sublistas a la izquierda y derecha del pivote
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Metodo para particionar el arreglo y ubicar el pivote en la posición correcta
    public static int partition(int[] arr, int low, int high) {
        // Usamos el ultimo elemento como pivote
        int pivot = arr[high];
        int i = low - 1; // Indice del elemento más pequeño

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivote, lo movemos a la izquierda
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        // Coloca el pivote en la posicion correcta
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Metodo para intercambiar dos elementos en el arreglo
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Metodo main para probar la implementación de QuickSort
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Array original: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}
