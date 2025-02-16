package array;
import java.util.Scanner;

class secondGreatestElementFind{
    int length,first,second;
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
    public void secondMaximum(){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>first) {
                second=first;
                first=arr[i];
            }else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        System.out.println("\n\nFirst Maximum Elements of array : "+first);
        System.out.println("\nSecond Maximum Elements of array : "+second);
    }
}

public class secondGreatest {
    public static void main(String[] args) {
        secondGreatestElementFind ob=new secondGreatestElementFind();
        ob.get();
        ob.show();
        ob.secondMaximum();
    }
}
