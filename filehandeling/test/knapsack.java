package test;

import java.io.*;
import java.util.*;

class Item implements Serializable {
    String name;
    int weight;
    int value;

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public String toString() {
        return name + " (Weight: " + weight + ", Value: " + value + ")";
    }
}

public class knapsack {

    static final String ITEMS_FILE = "items.data";
    static final String DP_FILE = "dp.data";
    static final String SELECTED_FILE = "selected.data";

    public static int[][] solveKnapsack(Item[] items, int capacity) {
        int n = items.length;
        int[][] dp = new int[n + 1][capacity + 1];
        for (int i = 1; i <= n; i++) {
            int wt = items[i - 1].weight;
            int val = items[i - 1].value;
            for (int cap = 0; cap <= capacity; cap++) {
                if (wt <= cap) {
                    dp[i][cap] = Math.max(dp[i - 1][cap], dp[i - 1][cap - wt] + val);
                } else {
                    dp[i][cap] = dp[i - 1][cap];
                }
            }
        }
        return dp;
    }

    public static List<Item> findSelectedItems(int[][] dp, Item[] items, int capacity) {
        List<Item> selected = new ArrayList<>();
        int i = items.length;
        int w = capacity;
        while (i > 0 && w > 0) {
            if (dp[i][w] != dp[i - 1][w]) {
                selected.add(items[i - 1]);
                w -= items[i - 1].weight;
            }
            i--;
        }
        return selected;
    }

    public static void saveToFile(Object obj, String filename) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(obj);
            out.close();
            System.out.println("Saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving to " + filename);
        }
    }

    public static Object loadFromFile(String filename) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            Object obj = in.readObject();
            in.close();
            return obj;
        } catch (Exception e) {
            System.out.println("Couldn't load from " + filename);
            return null;
        }
    }

    public static void main(String[] args) {
        int capacity = 45;

        Item[] items;
        File itemFile = new File(ITEMS_FILE);
        if (itemFile.exists()) {
            items = (Item[]) loadFromFile(ITEMS_FILE);
        } else {
            items = new Item[] {
                new Item("Laptop", 10, 60),
                new Item("Camera", 20, 100),
                new Item("Phone", 30, 120),
                new Item("Book", 5, 30)
            };
            saveToFile(items, ITEMS_FILE);
        }

        int[][] dp = solveKnapsack(items, capacity);
        saveToFile(dp, DP_FILE);

        List<Item> selected = findSelectedItems(dp, items, capacity);
        saveToFile(selected, SELECTED_FILE);

        int[][] loadedDP = (int[][]) loadFromFile(DP_FILE);
        List<Item> loadedSelected = (List<Item>) loadFromFile(SELECTED_FILE);

        System.out.println("\n=== Knapsack Results ===");
        System.out.println("Maximum value: " + loadedDP[items.length][capacity]);
        System.out.println("Selected items:");
        for (Item item : loadedSelected) {
            System.out.println("- " + item);
        }
    }
}
