//Q.5 Swap two numbers without using THIRD variable.

import java.util.Scanner;


class Swap{
    int num1,num2;

    public void get(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("A : ");
        num1=in.nextInt();
        System.out.print("B : ");
        num2=in.nextInt();
    }
    public void show(){
        
        System.out.println("Swaped values");
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("A : "+num1+"\nB : "+num2);
    }
}

public class Swaptwonumber {
    public static void main(String[] args) {
        Swap ob=new Swap();
        ob.get();
        ob.show();
    }
}
