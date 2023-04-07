public class Books {
    private String title;
    private int edition;
    private String releaseDate;
    private int amount;
    private boolean isBorrowed;
    private String category;
    private int borrowedAmount;

    public Books() {
        setTitle(title);
        setEdition(edition);
        setReleaseDate(releaseDate);
        setAmount(amount);
        setBorrowed(isBorrowed);
        setCategory(category);
        setBorrowedAmount(borrowedAmount);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setBorrowedAmount(int borrowedAmount) {
        this.borrowedAmount = borrowedAmount;
    }

    public int getBorrowedAmount() {
        return borrowedAmount;
    }
}
