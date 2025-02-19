package bitmanipulation;

import java.util.Scanner;

public class evenodd {
    public static void evenOddMethod(int num){
        int bitMask=1;
        if((num&bitMask)==0){
            System.out.println("Even no.  \t"+num);
        }else{
            System.out.println("Odd no.  \t"+num);
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter A Numaber to check even or odd: ");
        int num=ob.nextInt();
        evenOddMethod(num);

    }
}
