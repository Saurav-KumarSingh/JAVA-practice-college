import java.util.Scanner;

public class One{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks for Physics : ");
        float physics = in.nextFloat();

        System.out.print("Enter marks for Chemistry : ");
        float chemistry = in.nextFloat();

        System.out.print("Enter marks for Mathematics : ");
        float mathematics = in.nextFloat();

        float totalMarks = physics + chemistry + mathematics;
        float percentage = (totalMarks / 300) * 100; 
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("\nPercentage: " + percentage + "%\n");
        if(percentage>=60){
            System.out.println("First");
        }
        else if(percentage>=45){
            System.out.println("Second");
        }
        else if(percentage>=33){
            System.out.println("Third");
        }
        else{
            System.out.println("Fail");
        }
        in.close();
    }
}

