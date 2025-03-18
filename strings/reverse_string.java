package strings;

class Reverse {
    void reverse1(String str) {
        char[] charArr = str.toCharArray(); // using toCharArray method
        for (int i = charArr.length - 1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }
    }

    void reverse2(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i)); // using charAt method
        }
    }

    void reverse3(String str) {
        StringBuilder stringBuilder = new StringBuilder(str); // using StringBuilder reverse method
        System.out.println(stringBuilder.reverse());
    }
}

public class reverse_string {
    public static void main(String[] args) {
        Reverse ob = new Reverse();

        // Test the reverse methods with a sample string
        System.out.println("Using reverse1:");
        ob.reverse1("Hello");
        System.out.println(); // To separate the outputs

        System.out.println("Using reverse2:");
        ob.reverse2("Hello");
        System.out.println(); // To separate the outputs

        System.out.println("Using reverse3:");
        ob.reverse3("Hello");
    }
}
