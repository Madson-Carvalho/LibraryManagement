import java.util.Scanner;

public class GeneralMenu {
    private int option;

    private LibraryMenu libraryMenu = new LibraryMenu();
    private UserMenu userMenu = new UserMenu();
    private Scanner read = new Scanner(System.in);

    public void setOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return this.option;
    }

    public void showGeneralMenu(UserResgistration userResgistration) {
        do {
            System.out.println("Escolha uma das opções abaixo: \n 1 - Gerenciar usuários \n 2 - Gerenciar livros \n");
            setOption(read.nextInt());
        } while(getOption() < 1 || getOption()  > 2);

        switch (getOption()) {
            case 1:
                userMenu.showMenu(this);
                break;
            case 2:
                libraryMenu.showMenu(this, userResgistration);
        }
    }

}
