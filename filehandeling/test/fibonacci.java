package test;

import java.io.*;

public class fibonacci {

    static final String FILE_NAME = "fib_cache.data";
    static int[] fibCache;

    
    public static int fib(int n) {
        if (n <= 1) return n;

        
        if (fibCache[n] != -1) {
            return fibCache[n];
        }

        
        fibCache[n] = fib(n - 1) + fib(n - 2);
        return fibCache[n];
    }

    public static void saveCache() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            out.writeObject(fibCache);
            out.close();
            System.out.println("Saved Fibonacci data to file.");
        } catch (IOException e) {
            System.out.println("Error saving Fibonacci data: " + e.getMessage());
        }
    }

    public static void loadCache(int n) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME));
            fibCache = (int[]) in.readObject();
            in.close();
            System.out.println("Load Fibonacci data from file.");
        } catch (Exception e) {
            System.out.println("No saved data found. Starting fresh.");
            fibCache = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                fibCache[i] = -1;
            }
        }
    }

    public static void main(String[] args) {
        int n = 45; 

        
        loadCache(n);

       
        int result = fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result);

       
        saveCache();
    }
}
