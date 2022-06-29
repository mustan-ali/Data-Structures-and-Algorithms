package QuickSort;
public class Main {
    public static void main(String[] args) {
        int[] array = {9, 4, 3, 2, 5, 8, 7, 6, 1, 10};
        displayArray(array);
        quickSort(array, 0, array.length - 1);
        displayArray(array);
    }

    public static int partition(int[] arr, int first, int last) {
        int pivot = arr[last];
        int i = first - 1;

        for (int j = first; j < last; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        int swap = arr[i + 1];
        arr[i + 1] = arr[last];
        arr[last] = swap;

        return i + 1;
    }

    public static void quickSort(int[] arr, int first, int last) {
        if (first < last) {
            int mid = partition(arr, first, last);
            quickSort(arr, first, mid - 1);
            quickSort(arr, mid + 1, last);
        }
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}