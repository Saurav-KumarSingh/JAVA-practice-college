import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java programming\\filehandeling\\assignment.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            System.out.println("\n\n\n");
            int count=0;
            
            // Reading character by character
            try (FileReader reader = new FileReader("D:\\Java programming\\filehandeling\\assignment.txt")) {
                int ch;
                while ((ch = reader.read()) != -1) {
                    System.out.print((char) ch);
                    count ++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            br.close();
       

            System.out.println("\n Number of chars in File: " + count);
    }
}
