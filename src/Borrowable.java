public interface Borrowable {
    void borrowItem(String borrowerName);
    void returnItem();
    boolean isAvailable();
    int getBorrowingPeriod(); // in days
    default String getBorrowingStatus() {
        return isAvailable() ? "Available for borrowing" : "Currently borrowed";
    }
}
