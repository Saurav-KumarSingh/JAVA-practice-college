package bitmanipulation;

class Operations{
    public void GET(int num,int i){//used to get Nth bit
        int bitMask=1<<i;
        if((bitMask&num)==0){
            System.out.println(i+"th bit is : 0");
        }else System.out.println(i+"th bit is : 1");
        
    }
    public int SET(int num,int i){//convert Nth bit =1
        int bitMask=1<<i;
        return (num | bitMask);
    }
    public int CLEAR(int num,int i){
        int bitMask=~(1<<i);
        return (num & bitMask);
    }
    public int UPDATE(int num,int i,int newBit){
        if(newBit==0){
            return CLEAR(num, i);
        }
        else return SET(num, i);
    }
}

public class bitOperations {
    public static void main(String[] args) {
        Operations ob=new Operations();
        ob.GET(10, 1);
        System.out.println("Num SET : "+ob.SET(10, 0));
        System.out.println("Num CLEAR : "+ob.CLEAR(10, 1));
        System.out.println("Num UPDATE : "+ob.UPDATE(10, 2,1));
    }
}
