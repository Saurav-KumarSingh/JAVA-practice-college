package  test;
import java.io.*;

public class lcs {

    //LCS and return DP table
    public static int[][] computeLCS(String A, String B) {
        int m = A.length();
        int n = B.length();
        int[][] dp = new int[m + 1][n + 1];

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp;
    }

    public static void serializeDP(int[][] dp, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(dp);
            System.out.println("DP table serialized to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[][] deserializeDP(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (int[][]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

   
    public static void main(String[] args) {
        String A = "saurav";
        String B = "ravsu";


        int[][] dp = computeLCS(A, B);

        String filename = "dp_table.data";
        serializeDP(dp, filename);

        // Step 3: Deserialize the DP table
        int[][] deserializedDP = deserializeDP(filename);

        if (deserializedDP != null) {
            // Step 4: Print the LCS length
            System.out.println("Length of LCS: " + deserializedDP[A.length()][B.length()]);
        } else {
            System.out.println("Failed to deserialize the DP table.");
        }
    }
}
