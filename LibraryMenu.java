import java.util.Scanner;

public class LibraryMenu {
    private int option;

    private BookResgistration bookResgistration = new BookResgistration();
    private BorrowAndReturnBook borrowAndReturnBook = new BorrowAndReturnBook();

    private Scanner read = new Scanner(System.in);

    public LibraryMenu() {
        setOption(option);
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return this.option;
    }

    public void showMenu(GeneralMenu menu, UserResgistration userResgistration) {
        do {
            System.out.println("Escolha uma das opções abaixo: \n 1 - Adicionar livro \n 2 - Editar livro \n 3 - Remover livro" +
                    "\n 4 - Listar livros \n 5 - Emprestar livro \n 6 - Devolver livro \n 7 - Voltar \n");
            setOption(read.nextInt());
        } while (getOption() > 7 || getOption() < 1);

        switch (getOption()) {
            case 1:
                bookResgistration.createBook();
                this.showMenu(menu, userResgistration);
                break;
            case 2:
                System.out.println("Para editar informe o número do id do livro");
                int idEdit = read.nextInt();
                bookResgistration.editBook(idEdit);
                this.showMenu(menu, userResgistration);
                break;
            case 3:
                System.out.println("Para remover informe o número do id do livro");
                int idRemove = read.nextInt();
                bookResgistration.removeBook(idRemove);
                this.showMenu(menu, userResgistration);
                break;
            case 4:
                bookResgistration.listBooks();
                this.showMenu(menu, userResgistration);
                break;
            case 5:
                borrowAndReturnBook.borrowBook(this.bookResgistration, userResgistration);
                this.showMenu(menu, userResgistration);
                break;
            case 6:
                System.out.println("asd");
                break;
            case 7:
                menu.showGeneralMenu(userResgistration);
        }

    }

}