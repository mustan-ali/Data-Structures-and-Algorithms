package InsertionSort;

public class Main {
    public static void main(String[] args) {

        int[] array = {9, 4, 3, 2, 5, 8, 7, 6, 1, 10};
        insertionSort(array);
        displayArray(array);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && key <= arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
