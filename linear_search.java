import java.util.Scanner;

class Search {
    int[] arr;

    
    public void get() {
        arr = new int[5];
        Scanner in = new Scanner(System.in);
        
       
        System.out.print("Enter element " +  ": ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

    public void show(){
        System.out.print("Enter element to search" +  ": ");
        Scanner in = new Scanner(System.in);
        int inp=in.nextInt();
        int i;
        for (i = 0; i < arr.length; i++) {
            if(inp==arr[i]){
                break;
            }
        }
        if((i+1)==arr.length)
        System.err.println("Not Found");
        else
        System.err.println("Found");
    }
    
}

public class linear_search {
    public static void main(String[] args) { 
        Search search = new Search();
        search.get();
        search.show();
    
        
        
        
    }
}
