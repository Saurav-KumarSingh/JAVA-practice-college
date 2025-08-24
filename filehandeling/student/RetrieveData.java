package student;
import java.io.*;
import java.util.ArrayList;

public class RetrieveData {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("studentsList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

            for (Student s : list) {
                System.out.println(s);
            }

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
