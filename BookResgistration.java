import java.util.ArrayList;
import java.util.Scanner;

public class BookResgistration {
    private ArrayList<Books> books = new ArrayList<Books>();
    private Books book;
    private Scanner read = new Scanner(System.in);

    public void setBooks(ArrayList<Books> books) {
        this.books = books;
    }

    public ArrayList<Books> getBooks() {
        return books;
    }

    public void createBook() {
        book = new Books();

        System.out.println("Digite o nome do livro");
        book.setTitle(read.nextLine());

        System.out.println("Digite a edição");
        book.setEdition(read.nextInt());

        read.nextLine();
        System.out.println("Digite a data de lançamento");
        book.setReleaseDate(read.nextLine());

        System.out.println("Digite a quantidade de exemplares");
        book.setAmount(read.nextInt());

        System.out.println("Emprestado");
        book.setBorrowed(read.nextBoolean());

        System.out.println("Digite a categoria");
        book.setCategory(read.nextLine());

        System.out.println("Salvando livro...");
        books.add(book);
        System.out.println("Livro salvo \n");
    }

    public void editBook(int index) {
        Books editBook = books.get(index);

        System.out.println("Digite o nome do livro");
        editBook.setTitle(read.nextLine());

        System.out.println("Digite a edição");
        editBook.setEdition(read.nextInt());

        read.nextLine();
        System.out.println("Digite a data de lançamento");
        editBook.setReleaseDate(read.nextLine());

        System.out.println("Digite a quantidade de exemplares");
        editBook.setAmount(read.nextInt());

        System.out.println("Emprestado");
        editBook.setBorrowed(read.nextBoolean());

        System.out.println("Digite a categoria");
        editBook.setCategory(read.nextLine());

        System.out.println("Editando livro...");
        books.set(index, editBook);
        System.out.println("Livro editado\n");
    }

    public void removeBook(int index) {
        System.out.println("Removendo livro...");
        books.remove(index);
        System.out.println("Livro removido \n");
    }

    public void listBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Id: " + i);

            System.out.print("Nome: ");
            System.out.print(this.books.get(i).getTitle());

            System.out.print("\nEdição: ");
            System.out.print(this.books.get(i).getEdition());

            System.out.print("\nData de lançamento: ");
            System.out.print(this.books.get(i).getReleaseDate());

            System.out.print("\nQuantidade de exemplares: ");
            System.out.print(this.books.get(i).getAmount());

            System.out.print("\nEmprestado: ");
            System.out.println(this.books.get(i).getIsBorrowed());

            System.out.print("\nCategoria: ");
            System.out.print(this.books.get(i).getCategory());

            System.out.print("\nQuantidade emprestada: ");
            System.out.println(this.books.get(i).getBorrowedAmount() + "\n");
        }
    }

}
