
import java.util.Scanner;

class Search{
    int A[];
    int item,low,high,mid;
    public void get(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 10 elements in array");
        A=new int[10];
        
        for(int i=0;i<A.length;i++){
            A[i]=in.nextInt();
        }
        System.out.println("Enter element to search");
        item=in.nextInt();

        low=0;
        high=A.length-1;
        mid=(low+high)/2;
    }
    public void find(){
        while(A[mid]!=item && low<=high){
            if(A[mid]<item){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        if(A[mid]==item)
        System.out.println("Item Found at\t"+(mid+1));
        else
        System.out.println("Item Not Found");
    }
}

public class binary_search {
    public static void main(String[] args) {
        
        Search ob=new Search();
        ob.get();
        ob.find();

    }
}
