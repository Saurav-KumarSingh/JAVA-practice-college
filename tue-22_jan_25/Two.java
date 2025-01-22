import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Price, Qty;
        System.out.print("Enter Price and Qty: ");
        Price = in.nextInt();
        Qty = in.nextInt();
        float Bill, disc = 0, net;
        Bill = Price * Qty;

        if (Bill >= 4000 && Bill <= 5000) {
            disc = (Bill * 20)/100; 
        } else if (Bill < 5000) {
            if(Bill<2000){
                disc = (Bill * 10)/100;
            }
        }

        net = Bill - disc;

       
        System.out.println("Net Amount: " + net);
    }
}
