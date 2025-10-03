import java.util.ArrayList;
public class LibraryManager {
    private ArrayList<Borrowable> items;
    public LibraryManager() {
        this.items = new ArrayList<>();
    }
    public void addItem(Borrowable item) {
        this.items.add(item);
    }
    public void displayAllItems() {
        System.out.println("All library items:");
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            System.out.println(" - " + li.getItemInfo() + " | Type: " + li.getItemType()
                    + " | Status: " + b.getBorrowingStatus());
        }
    }
    public void displayAvailableItems() {
        System.out.println("Available items:");
        for (Borrowable b : items) {
            if (b.isAvailable()) {
                LibraryItem li = (LibraryItem) b;
                System.out.println(" - " + li.getItemInfo() + " | Type: " + li.getItemType());
            }
        }
    }
    public boolean borrowItem(String itemId, String borrowerName) {
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            if (li.getItemId().equals(itemId)) {
                if (b.isAvailable()) {
                    b.borrowItem(borrowerName);
                    System.out.println("Borrowed item " + itemId + " to " + borrowerName);
                    return true;
                } else {
                    System.out.println("Item " + itemId + " is not available.");
                    return false;
                }
            }
        }
        System.out.println("Item " + itemId + " not found.");
        return false;
    }
    public boolean returnItem(String itemId) {
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            if (li.getItemId().equals(itemId)) {
                if (!b.isAvailable()) {
                    b.returnItem();
                    System.out.println("Returned item " + itemId);
                    return true;
                } else {
                    System.out.println("Item " + itemId + " is already available.");
                    return false;
                }
            }
        }
        System.out.println("Item " + itemId + " not found.");
        return false;
    }
    public double calculateTotalLateFees(int daysLate) {
        double total = 0.0;
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            total += li.calculateLateFee(daysLate);
        }
        return total;
    }
}

