public class mergeSort {
    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start; // iterator for left
        int j = mid + 1; // iterator for right
        int k = 0; // iterator for temp array

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // elements left in left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // elements left in right part
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void sort(int arr[], int start, int end) {
        // base case
        if (start >= end) return;

        // divide
        int mid = start + (end - start) / 2;
        sort(arr, start, mid); // left part
        sort(arr, mid + 1, end); // right
        merge(arr, start, mid, end);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {21, 32, 12, 1, 34, 23, 66, 9};
        sort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
