import java.util.Scanner;

public class Library {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("******************** Welcome to Saurav's Library! ********************");
        System.out.println("                  Select From The Following Options:               ");
        System.out.println("**********************************************************************");

        Books ob = new Books();           // Book operations
        Students obStudent = new Students(); // Student operations

        int choice;

        do {
            // Displaying menu
            ob.dispMenu();

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Book b = new Book();
                    ob.addBook(b);
                    break;

                case 2:
                    ob.upgradeBookQty();
                    break;

                case 3:
                    ob.searchBookBySNo();
                    break;

                case 4:
                    ob.showAllBooks();
                    break;

                case 5:
                    Student s = new Student();
                    obStudent.addStudent(s);
                    break;

                case 6:
                    obStudent.showAllStudents();
                    break;

                case 7:
                    obStudent.checkOutBook(ob);
                    break;

                case 8:
                    obStudent.checkInBook(ob);
                    break;

                case 0:
                    System.out.println("Exiting... Thank you for using the Library System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 0 and 8.");
                    break;
            }

        } while (choice != 0);

        input.close(); // Don't forget to close the scanner
    }
}
