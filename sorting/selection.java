
import java.util.Scanner;

class Sortelement {
    int A[]=new int[6];

    public void get(){
        System.out.println("Enter 7 elements : ");
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i]=input.nextInt();
        }

    }

    public void sort(){
        for (int i = 0; i < A.length; i++) {
            int minPos=i;
            for (int j = i+1; j < A.length; j++) {
                
                if(A[j]<A[minPos]){
                    minPos=j;
                }
            }
            int temp=A[i];
                A[i]=A[minPos];
                A[minPos]=temp;
            
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+"\t");
            
        }
    }
    
}

public class selection {
    public static void main(String[] args) {
        Sortelement ob =new Sortelement();
        ob.get();
        ob.sort();
    }
}
