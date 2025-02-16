package array;
import java.util.Scanner;

class greatestElementFind{
    int length,max=0;
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
    public void maximum(){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("\nMaximum Elements of array : "+max);
    }
}

public class greatestElement {
    public static void main(String[] args) {
        greatestElementFind ob=new greatestElementFind();
        ob.get();
        ob.show();
        ob.maximum();
    }
}
