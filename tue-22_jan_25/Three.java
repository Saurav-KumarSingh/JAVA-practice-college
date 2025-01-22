
import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Unit, Rate = 0, Bill = 0;
        System.out.print("Enter Unit : ");
        Unit = in.nextInt();
        if (Unit <= 200) {
            Bill = 0;
        } else if (Unit <= 600) {
            Bill = (Unit - 200) * 2;
        } else if (Unit <= 650) {
            Bill = 400 * 2 + (Unit - 600) * 3;
        } else {
            Bill = 400 * 2 + 50 * 3 + (Unit - 650) * 6;
        }
        System.out.println("Bill=" + Bill);
    }
}
