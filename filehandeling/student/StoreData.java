package student;

import java.io.*;
import java.util.ArrayList;

public class StoreData {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Saurabh", 65));
        list.add(new Student("Raj", 55));
        list.add(new Student("Nitish", 75));

        try {
            FileOutputStream fos = new FileOutputStream("studentsList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
            System.out.println("Data Stored");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
