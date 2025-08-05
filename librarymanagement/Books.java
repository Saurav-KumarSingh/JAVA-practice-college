import java.util.Scanner;

public class Books {
    Book[] theBooks = new Book[40];
    public static int count = 0;

    Scanner input = new Scanner(System.in);

    // Compare books based on title and serial number
    public int compareBook(Book b1, Book b2) {
        if (b1.title.equalsIgnoreCase(b2.title)) {
            System.out.println("Book already exists with this title.");
            return 0;
        }
        if (b1.sNo == b2.sNo) {
            System.out.println("Book with this Serial No. already exists.");
            return 0;
        }
        return 1;
    }

    // Add a new book
    public void addBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (compareBook(b, theBooks[i]) == 0) {
                return;
            }
        }

        if (count < theBooks.length) {
            theBooks[count++] = b;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("No space to add more books.");
        }
    }

    // Search book by Serial Number
    public void searchBookBySNo() {
        System.out.println("\tSEARCH BY SERIAL NUMBER\n");
        System.out.print("Enter Serial No of Book: ");
        int sNo = input.nextInt();

        boolean found = false;
        System.out.println("S.No\tName\tAuthor\tAvailable Qty\tTotal Qty");

        for (int i = 0; i < count; i++) {
            Book book = theBooks[i];
            if (book != null && book.sNo == sNo) {
                System.out.println(book);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book with Serial No " + sNo + " not found.");
        }
    }

    // Show all books
    public void showAllBooks() {
        System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

        boolean found = false;
        for (Book book : theBooks) {
            if (book != null) {
                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("\nNo books available in library...\n");
        }
    }

    // Upgrade quantity of a book
    public void upgradeBookQty() {
        System.out.println("\tUPGRADE QUANTITY OF A BOOK\n");
        System.out.print("Enter Serial No of Book: ");
        int sNo = input.nextInt();

        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                System.out.print("Enter number of copies to add: ");
                int addQty = input.nextInt();
                theBooks[i].qty += addQty;
                theBooks[i].qtyCopy += addQty;
                System.out.println("Book quantity updated.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Display menu
    public void dispMenu() {
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println("Press 6 to Show All Registered Students.");
        System.out.println("Press 7 to Check Out Book.");
        System.out.println("Press 8 to Check In Book.");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
    }

    // Check availability
    public int isAvailable(int sNo) {
        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                if (theBooks[i].qtyCopy > 0) {
                    System.out.println("Book is Available.");
                    return i;
                }
                System.out.println("Book is currently unavailable.");
                return -1;
            }
        }
        System.out.println("No Book with Serial Number " + sNo + " found.");
        return -1;
    }

    // Check out book
    public Book checkOutBook() {
        System.out.print("Enter Serial No of Book to be Checked Out: ");
        int sNo = input.nextInt();

        int bookIndex = isAvailable(sNo);
        if (bookIndex != -1) {
            theBooks[bookIndex].qtyCopy--;
            System.out.println("Book checked out successfully.");
            return theBooks[bookIndex];
        }
        return null;
    }

    // Check in book
    public void checkInBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (b.equals(theBooks[i])) {
                theBooks[i].qtyCopy++;
                System.out.println("Book checked in successfully.");
                return;
            }
        }
        System.out.println("Book not recognized.");
    }
}
