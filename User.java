import java.util.ArrayList;

public class User {
    private String fullName;
    private String loginName;
    private String password;
    private String cpf;
    private String email;
    private ArrayList<String> borrowedBooks;

    public User() {
        setFullName(fullName);
        setLoginName(loginName);
        setPassword(password);
        setCpf(cpf);
        setEmail(email);
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setBorrowedBooks(String borrowedBooks) {
        this.borrowedBooks.add(borrowedBooks);
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }
}