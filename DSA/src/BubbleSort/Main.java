package BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 4, 3, 2, 5, 8, 7, 6, 1, 10};
        displayArray(array);
        bubbleSort(array);
        displayArray(array);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }


    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}