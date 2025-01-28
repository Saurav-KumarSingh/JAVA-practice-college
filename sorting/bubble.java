
import java.util.Scanner;

class Sortelement {
    int A[]=new int[6];

    public void get(){
        System.out.println("Enter 6 elements : ");
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i]=input.nextInt();
        }

    }

    public void sort(){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < (A.length-i); j++) {
                
                if(A[j]>A[j+1]){
                    int T=A[j];
                    A[j]=A[j+1];
                    A[j+1]=T;
                }
            }
            
        }

        System.out.println("Sorted elements : ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "\t");
        }
    }
    
}

public class bubble {
    public static void main(String[] args) {
        Sortelement ob =new Sortelement();
        ob.get();
        ob.sort();
    }
}
