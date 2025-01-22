import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,sum=0,max=0,max2=0;
        int [] sal=new  int[5];
        System.out.println("Enter people salaries: ");
        for(i=0;i<sal.length;i++){
            sal[i]=in.nextInt();
        }
        for(i=0;i<sal.length;i++){
            System.out.print(sal[i]+"    ");
        }

        for(i=0;i<sal.length;i++){
            sum+=sal[i];
        }
        System.out.print("\nSum of salary = "+sum);

        for(i=0;i<sal.length;i++){
            if(max<=sal[i]){
                max=sal[i];
            }
        }
        System.out.print("\nMax of salary = "+max);
        System.out.print("\nCount of salary = "+(sal.length));
        System.out.print("\nEnter amount to search : ");
        int search=in.nextInt();
        for(i=0;i<sal.length;i++){
            if(search==sal[i]){
                System.out.println("found");
            }
            
        }
        
        System.out.print("\nReverse of array  ");
        int reverse[]=new int[5];
        for(i=0;i<sal.length;i++){
            reverse[i]=sal[sal.length-1-i];
        }
        for(i=0;i<reverse.length;i++){
            System.out.print(reverse[i]+"    ");
        }
        for (i = 0; i < sal.length; i++) {
            if (sal[i] > max) {
                max2 = max;
                max = sal[i];
            } else if (sal[i] > max2 && sal[i] != max) {
                max2 = sal[i];
            }
        }

        System.out.println("\nSecond max value is: " + max2);
    }
}
