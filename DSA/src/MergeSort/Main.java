package MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 4, 3, 2, 5, 8, 7, 6, 1, 10};
        printArray(array);
        mergeSort(array, 0, array.length - 1);
        printArray(array);
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {

        int LeftArraySize = mid - start + 1;
        int RightArraySize = end - mid;

        int[] LeftArray = new int[LeftArraySize];
        int[] RightArray = new int[RightArraySize];
        
        for (int i = 0; i < LeftArraySize; i++) {
            LeftArray[i] = arr[start + i];
        }
        for (int j = 0; j < RightArraySize; j++) {
            RightArray[j] = arr[mid + 1 + j];
        }

        int x = 0;
        int y = 0;
        int k = start;

        while (x < LeftArraySize && y < RightArraySize) {
            if (LeftArray[x] <= RightArray[y]) {
                arr[k] = LeftArray[x];
                x++;
            } else {
                arr[k] = RightArray[y];
                y++;
            }
            k++;
        }

        while (x < LeftArraySize) {
            arr[k] = LeftArray[x];
            x++;
            k++;
        }

        while (y < RightArraySize) {
            arr[k] = RightArray[y];
            y++;
            k++;
        }
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}