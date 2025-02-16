package array;

import java.util.Scanner;

class subArraysMethod {
    int length;
    int arr[];
    int currentSum=0,maxSum=Integer.MIN_VALUE;

    public void get() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        length = input.nextInt();
        arr = new int[length];
        System.out.println("Enter the elements in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

    }

    public void show() {
        System.out.println("Elements of Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public void showSubArray() {
        System.out.println("\nSubArrays : ");
        for (int i = 0; i <arr.length;i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public void showSubArrayMaximum() {
        System.out.println("\nSubArrays Maximum for each: ");
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length;i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                for (int k = start; k <= end; k++) {
                    if(max<arr[k]) max=arr[k];
                }
                System.out.println(" Maximum is : "+max);
            }
            max=0;
            System.out.println();
        }
    }
    //using brute force
    public void showSubArrayMaxSum() {
        maxSum=0;currentSum=0;
        System.out.println("\nSubArrays Maximum for each: ");
        for (int i = 0; i <arr.length;i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                currentSum=0;
                for (int k = start; k <= end; k++) {
                    currentSum+=arr[k];
                }
                if(maxSum<currentSum) maxSum=currentSum;
                System.out.println("possible sum = "+currentSum);
            }
            System.out.println();
            
        }
        System.out.println("\n\n\nMax sum : "+maxSum);
    }

    //using Kadane's Algo

    public void showSubArrayMaxSum_Using_Kadan(){
        int cs=0,ms=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs+=arr[i];
            if(cs<0) cs=0;
            ms=Math.max(ms, cs);
        }
        System.out.println("Maximum Value Sum =  "+ms);

    }
    
    
}

public class subArrays {
    public static void main(String[] args) {
        subArraysMethod ob = new subArraysMethod();
        ob.get();
        ob.show();
        ob.showSubArray();
        ob.showSubArrayMaximum();
        ob.showSubArrayMaxSum();
        ob.showSubArrayMaxSum_Using_Kadan();
    }

}
