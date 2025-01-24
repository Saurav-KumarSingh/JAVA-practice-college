//Q.3 Print Sum of TWO arr_1ays a[5] & b[5] and print Grand Total also.

import java.util.Scanner;

class ArrayData{
    int arr_1[]=new int[5];
    int arr_2[]=new int[5];
    public void get(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter values in 1st arr_1ay");
        for(int i=0;i<arr_1.length;i++){
            arr_1[i]=in.nextInt();
        }
        System.out.println("Enter values in 2nd arr_1ay");
        for(int i=0;i<arr_2.length;i++){
            arr_2[i]=in.nextInt();
        }
    }
    public void sum(){
        
        System.out.println("Sum of two arrays : ");
        for(int i=0;i<arr_1.length;i++){
            int sum=arr_1[i]+arr_2[i];
            System.out.print(sum+"\t");
            
        }
       
    }
    public void total(){
        
        int sum=0;
        for(int i=0;i<arr_1.length;i++){
            sum+=arr_1[i]+arr_2[i];
        }
        System.out.println("\nGrand Total : "+sum);
    }
}

public class SumOfTwoArrays {
    public static void main(String[] args) {
        ArrayData ob=new ArrayData();
        ob.get();
        ob.sum();
        ob.total();
    }
}
