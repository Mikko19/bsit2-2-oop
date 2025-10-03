public abstract class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;
    protected boolean isCheckedOut;
    protected String borrowerName;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
        this.borrowerName = null;
    }

    public String getItemId() {
        return itemId;
    }
    public String getItemInfo() {
        String status = isCheckedOut ? "Checked out by " + borrowerName : "Available";
        return String.format("[%s] %s by %s - %s", itemId, title, author, status);
    }
    public void checkOut(String borrowerName) {
        if (isCheckedOut) {
            System.out.println("Item " + itemId + " is already checked out.");
            return;
        }
        this.isCheckedOut = true;
        this.borrowerName = borrowerName;
    }
    public void checkIn() {
        if (!isCheckedOut) {
            System.out.println("Item " + itemId + " is not currently checked out.");
            return;
        }
        this.isCheckedOut = false;
        this.borrowerName = null;
    }
    public abstract String getItemType();
    public abstract double calculateLateFee(int daysLate);
}
