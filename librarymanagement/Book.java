import java.util.Scanner;

public class Book {
    int sNo;
    String title;
    String author;
    int qty;
    int qtyCopy;

    Scanner input = new Scanner(System.in);

    public Book() {
        System.out.print("Enter Serial No: ");
        this.sNo = input.nextInt();
        input.nextLine(); // consume newline
        System.out.print("Enter Book Title: ");
        this.title = input.nextLine();
        System.out.print("Enter Author Name: ");
        this.author = input.nextLine();
        System.out.print("Enter Total Quantity: ");
        this.qty = input.nextInt();
        this.qtyCopy = this.qty;
    }

    @Override
    public String toString() {
        return sNo + "\t\t" + title + "\t\t" + author + "\t\t" + qtyCopy + "\t\t" + qty;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return this.sNo == other.sNo;
    }
}
