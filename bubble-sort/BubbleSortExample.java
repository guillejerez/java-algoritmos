public class BubbleSortExample {

    // Método para ordenar un arreglo usando Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Recorremos todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            // En cada pasada, el último elemento ya está en la posición correcta
            for (int j = 0; j < n - 1 - i; j++) {
                // Si el elemento actual es mayor que el siguiente, se intercambian
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Arreglo de ejemplo
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Ordenamos el arreglo
        bubbleSort(arr);

        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
