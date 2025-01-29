class merging{
    int []a={10,20,30,40,50};
    int []b={15,22,35,65,75};
    int []c;
    int i=0,j=0,k=0;
    public void show(){
        c=new int[10];
        
        while (i<5 && j<5) { 
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        if(i<5)//elements in a[i] are still left to merge
        {
            while (i<5) c[k++]=a[i++];
        }
        if (j<5) {
            while(j<5) c[k++]=b[j++];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i]+"\t");
        }
    }
}

public class merge {
    public static void main(String[] args) {
        merging ob=new merging();
        ob.show();
    }
}
