
import java.util.Scanner;

// Q.4 Using if Print Result of studnet 
 
 
//  Score   Grade   
//  >40      C
//  >50      B+
//  >60      B
//  >85      A
//  >90      A+

class Grade{
    float mark;
    public void get(){
        Scanner in=new Scanner(System.in);
        System.out.println("\nEnter mark to check grade: ");
        mark=in.nextFloat();
    }
    public void showGrade(){
        if(mark>90)
        System.out.println("Grade : A+");
        else if(mark>85)
        System.out.println("Grade : A");
        else if(mark>60)
        System.out.println("Grade : B+");
        else if(mark>50)
        System.out.println("Grade : B");
        else
        System.out.println("Grade : C");
    }
}


public class Result {
    public static void main(String[] args) {
        Grade ob=new Grade();
        ob.get();
        ob.showGrade();
    }
}
