public class quick {
    public static void quicksort(int arr[],int start,int end) {

        //base condition
        if(start>=end) return;

        int pivot=arr[start];//choosing first element as pivot.
        int left=start,right=end;
        while (left<=right) { 
            while (arr[left]<=pivot && left<=right) { 
                left++;
            }
            while (arr[right]>=pivot && left<=right) { 
                right--;
            }
            if (left<right) {
                swap(arr, left, right);
            }

        }
        //swap for the pivot position
        swap(arr, start,right );


        //recursion

        quicksort(arr, start, right-1);//for left parition
        quicksort(arr, right+1, end);//for right parition
         
    }
    private static void swap(int arr[],int leftIdx,int rightIdx){
        int temp=arr[leftIdx];
        arr[leftIdx]=arr[rightIdx];
        arr[rightIdx]=temp;
    }
    private static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={10,22,1,23,11,34,21,32,13,21,23,22,98};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
