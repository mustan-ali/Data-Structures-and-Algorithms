/*
Insertion
Deletion
Linear Search
Binary Search
*/

package Array;

public class Main {
    public static void main(String[] args) {

        int[] Array1 = new int[12];
        initializeArray(Array1, 10);
        printArray(Array1);
        System.out.println("\n");
        insertion(Array1, 2, 99);
        printArray(Array1);
        System.out.println("\n");
        deletion(Array1, 2);
        printArray(Array1);
        System.out.println("\n");
        linearSearch(Array1, 80);
        binarySearch(Array1, 90);
    }

    static void initializeArray(int[] arr, int indexUsed) {
        for (int i = 0; i <= indexUsed; i++) {
            arr[i] = (i + 1) * 10;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " --> " + arr[i]);
        }
    }

    static void insertion(int[] arr, int index, int value) {
        if (index < arr.length) {
            for (int i = arr.length - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
        }
    }

    static void deletion(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    static void linearSearch(int[] arr, int value) {
        boolean found = false;
        int foundIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                found = true;
                foundIndex = i;
            }
        }
        if (found) {
            System.out.println("Value " + value + " found at Index: " + foundIndex);
        } else {
            System.out.println("Value " + value + " not found in an Array.");
        }
    }

    static void binarySearch(int[] arr, int value) {
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;

        while (first <= last) {
            if (arr[mid] < value) {
                first = mid + 1;
            } else if (arr[mid] == value) {
                System.out.println("Value " + value + " found at Index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Value " + value + " not found in an Array.");
        }
    }
}