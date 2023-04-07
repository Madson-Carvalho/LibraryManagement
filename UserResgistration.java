import java.util.ArrayList;
import java.util.Scanner;

public class UserResgistration {
    private ArrayList<User> users = new ArrayList<User>();
    private User user;
    private Scanner read = new Scanner(System.in);

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void createUser() {
        user = new User();

        System.out.println("Digite o nome completo do Usuário");
        user.setFullName(read.nextLine());

        System.out.println("Digite o nome de login");
        user.setLoginName(read.nextLine());

        System.out.println("Digite a senha");
        user.setPassword(read.nextLine());

        System.out.println("Digite o CPF");
        user.setCpf(read.nextLine());

        System.out.println("Digite o e-mail");
        user.setEmail(read.nextLine());

        System.out.println("Salvando usuário...");
        users.add(user);
        System.out.println("Usuário salvo \n");
    }

    public void editUser(int index) {
        User editUser = users.get(index);

        System.out.println("Digite o nome completo do Usuário");
        editUser.setFullName(read.nextLine());

        System.out.println("Digite o nome de login");
        editUser.setLoginName(read.nextLine());

        System.out.println("Digite a senha");
        editUser.setPassword(read.nextLine());

        System.out.println("Digite o CPF");
        editUser.setCpf(read.nextLine());

        System.out.println("Digite o e-mail");
        editUser.setEmail(read.nextLine());

        System.out.println("Editando usuário...");
        users.set(index, editUser);
        System.out.println("Usuário editado\n");
    }

    public void removeUser(int index) {
        System.out.println("Removendo usuário...");
        users.remove(index);
        System.out.println("Usuário removido \n");
    }

    public void listUser() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println("Id: " + i);

            System.out.print("Nome: ");
            System.out.print(this.users.get(i).getFullName());

            System.out.print("\nLogin: ");
            System.out.print(this.users.get(i).getLoginName());

            System.out.print("\nSenha: ");
            System.out.print(this.users.get(i).getPassword());

            System.out.print("\nCPF: ");
            System.out.print(this.users.get(i).getCpf());

            System.out.print("\nE-mail: ");
            System.out.print(this.users.get(i).getEmail());

            System.out.print("\nLivros pegos: ");
            System.out.println(this.users.get(i).getBorrowedBooks() + "\n");
        }
    }

}
