package array;

import java.util.Scanner;

class reverseMethod {
    int length;
    int arr[];
    public void get(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of Array");
        length=input.nextInt();
        arr=new int[length];
        System.out.println("Enter the elements in Array");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

    }
    public void show(){
        System.out.println("Elements of Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public void showReverse(){
        System.out.println("\nReverse elements of Array : ");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+"\t");
        }
    }
}

public class rerversearr {
    public static void main(String[] args) {
        reverseMethod ob=new reverseMethod();
        ob.get();
        ob.show();
        ob.showReverse();
    }
}
