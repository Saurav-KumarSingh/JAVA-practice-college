package array;
import java.util.Scanner;

class pairsElement{
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
    public void pairs(){
        System.out.println("\nPairs : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]!=arr[j]) System.out.print("("+arr[i]+","+arr[j]+")\t");
            }
            System.out.println();
        }
    }
}

public class pairsInArraya {
    public static void main(String[] args) {
        pairsElement ob=new pairsElement();
        ob.get();
        ob.show();
        ob.pairs();
    }
}
