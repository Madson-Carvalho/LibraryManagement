import java.util.Scanner;

public class UserMenu {
    private int option;

    private Scanner read = new Scanner(System.in);
    private UserResgistration userResgistration = new UserResgistration();

    public UserMenu() {
        setOption(option);
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return this.option;
    }

    public void showMenu(GeneralMenu menu) {
        do {
            System.out.println("Escolha uma das opções abaixo \n 1 - Criar usuário \n 2 - Editar usuário \n 3 - Remover usuário \n 4 - Listar usuários \n 5 - Voltar \n");
            setOption(read.nextInt());
        } while (getOption() > 5 || getOption() < 1);

        switch (getOption()) {
            case 1:
                userResgistration.createUser();
                this.showMenu(menu);
                break;
            case 2:
                System.out.println("Para editar informe o número do id do usuário");
                int idEdit = read.nextInt();
                userResgistration.editUser(idEdit);
                this.showMenu(menu);
                break;
            case 3:
                System.out.println("Para remover informe o número do id do usuário");
                int idRemove = read.nextInt();
                userResgistration.removeUser(idRemove);
                this.showMenu(menu);
                break;
            case 4:
                userResgistration.listUser();
                this.showMenu(menu);
                break;
            case 5:
                menu.showGeneralMenu(this.userResgistration);
        }

    }

}