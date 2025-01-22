
import java.util.Scanner;

public class series {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter a no. for seieses :"); 
            
            int N=in.nextInt();
            for (int i = 0; i <= N; i++) {
                System.out.print(i % 2 + " ");
            }
            System.out.println('\n');
            for (int i = 1; i <= N; i++) {
                System.out.print(i * i + " ");
            }
            System.out.println('\n'); 
            int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
        System.out.println('\n');
        int value = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(value + " ");
            value *= 10;
        } System.out.println('\n');

        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }System.out.println('\n');
        for (int i = -1; i >= -N; i--) {
            System.out.print(i + " ");
        }

       
        }
     
}
