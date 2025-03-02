public class quick {
    public static void quicksort(int arr[], int start, int end) {
        // Base condition
        if (start >= end) return;

        // Partition the array and get the pivot index
        int pivotIndex = partition(arr, start, end);

        // Recursively sort the left and right subarrays
        quicksort(arr, start, pivotIndex - 1);
        quicksort(arr, pivotIndex + 1, end);
    }

    private static int partition(int arr[], int start, int end) {
        int pivot = arr[start]; // Choosing first element as pivot
        int left = start + 1, right = end;

        while (left <= right) {  // Ensuring that left does not surpass right
            while (left <= right && arr[left] <= pivot) left++;
            while (left <= right && arr[right] > pivot) right--;

            if (left < right) {
                swap(arr, left, right);
            }
        }

        // Place pivot at its correct position
        swap(arr, start, right);
        return right; // Return the pivot index
    }

    private static void swap(int arr[], int leftIdx, int rightIdx) {
        int temp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = temp;
    }

    private static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, 1, 23, 11, 34, 21, 22, 98};
        quicksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
