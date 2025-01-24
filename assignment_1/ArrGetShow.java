//Q.2 Get and show Array values using 10% increment.


import java.util.Scanner;

class Data{
    int arr[]=new int[5];
    public void get(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter values in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
    }
    public void show(){
        
        System.out.println("Actual and Incremented Values by 10%:");
        for(int i=0;i<arr.length;i++){
            int incremented_value=(arr[i]*110)/100;
            System.out.println("Actual :\t"+arr[i]+"\tIncreamented:\t"+incremented_value);
            
        }
    }
}

public class ArrGetShow {
    public static void main(String[] args) {
        Data ob=new Data();
        ob.get();
        ob.show();

    }
}
