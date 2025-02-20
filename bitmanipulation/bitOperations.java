package bitmanipulation;

class Operations {
    public void getBit(int num, int i) { // Get Nth bit
        int bitMask = 1 << i;
        if ((bitMask & num) == 0) {
            System.out.println(i + "th bit is : 0");
        } else {
            System.out.println(i + "th bit is : 1");
        }
    }

    public int setBit(int num, int i) { // Convert Nth bit to 1
        int bitMask = 1 << i;
        return (num | bitMask);
    }

    public int clearBit(int num, int i) { // Clear Nth bit
        int bitMask = ~(1 << i);
        return (num & bitMask);
    }

    public int updateBit(int num, int i, int newBit) { // Update Nth bit
        if (newBit == 0) {
            return clearBit(num, i);
        } else {
            return setBit(num, i);
        }
    }

    public boolean isPowerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }

    public int countOnesInNumber(int num) { // Count 1s in binary representation
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1; // Fix: Right shift to avoid infinite loop
        }
        return count;
    }
}

public class bitOperations {
    public static void main(String[] args) {
        Operations ob = new Operations();
        ob.getBit(10, 1);
        System.out.println("Num SET : " + ob.setBit(10, 0));
        System.out.println("Num CLEAR : " + ob.clearBit(10, 1));
        System.out.println("Num UPDATE : " + ob.updateBit(10, 2, 1));
        System.out.println("Is number power of 2: " + ob.isPowerOfTwo(8));
        System.out.println("Count of 1s in given number: " + ob.countOnesInNumber(2));
    }
}
