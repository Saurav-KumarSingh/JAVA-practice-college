import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Salary, Tax,amountToBePaid;
        System.out.print("Enter Salary : ");
        Salary = in.nextInt();
        if (Salary >=1000000) {
            Tax=(Salary*18)/100;
        } else if (Salary >=700000) {
            Tax=(Salary*12)/100;
        } else if (Salary >=400000) {
            Tax=(Salary*5)/100;
        } else {
            Tax=0;
        }
        amountToBePaid=Salary-Tax;
        System.out.println("Amount To Be Paid=" + amountToBePaid );
    }
}
