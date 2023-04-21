import java.util.ArrayList;
import java.util.Scanner;

public class BorrowAndReturnBook {
    private String borrowBook;
    private int userId;

    private Scanner read = new Scanner(System.in);

    public void setBorrowBook(String borrowBook) {
        this.borrowBook = borrowBook;
    }

    public String getBorrowBook() {
        return borrowBook;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void borrowBook (BookResgistration bookResgistration, UserResgistration userResgistration) {

        System.out.println("Digite o nome do livro emprestado");
        setBorrowBook(read.nextLine());

        userResgistration.listUser();

        System.out.println("Digite o id do Usuário a quem será emprestado");
        setUserId(read.nextInt());
        User user = userResgistration.getUsers().get(getUserId());

        user.setBorrowedBooks(getBorrowBook());

        ArrayList<Books> books = bookResgistration.getBooks();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(getBorrowBook())) {
                books.get(i).setBorrowedAmount(books.get(i).getBorrowedAmount() + 1);
            }
        }
    }

    public void returnBook (BookResgistration bookResgistration, UserResgistration userResgistration) {

        System.out.println("Digite o nome do livro devolvido");
        setBorrowBook(read.nextLine());

        userResgistration.listUser();

        System.out.println("Digite o id do Usuário que devolveu o livro");
        setUserId(read.nextInt());
        User user = userResgistration.getUsers().get(getUserId());

        user.setBorrowedBooks(getBorrowBook());

        ArrayList<Books> books = bookResgistration.getBooks();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(getBorrowBook())) {
                books.get(i).setBorrowedAmount(books.get(i).getBorrowedAmount() - 1);
            }
        }
    }

}
