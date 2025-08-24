package student;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int score; // or marks

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}
