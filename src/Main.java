public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Book book1 = new Book("B001", "The Wuxia Way", "L. Author", "ISBN-001", 320, "Fantasy");
        Book book2 = new Book("B002", "Data Structures", "A. Coder", "ISBN-002", 450, "Education");

        Magazine mag1 = new Magazine("M001", "Science Monthly", "Various", 12, "December", true);
        Magazine mag2 = new Magazine("M002", "Fashion Weekly", "Various", 45, "June", false);

        DVD dvd1 = new DVD("D001", "Adventure Movie", "Dir. A", 120, "PG-13", "Adventure");
        DVD dvd2 = new DVD("D002", "Kids Show", "Dir. B", 80, "G", "Kids");

        manager.addItem(book1);
        manager.addItem(book2);
        manager.addItem(mag1);
        manager.addItem(mag2);
        manager.addItem(dvd1);
        manager.addItem(dvd2);

        Student student = new Student("U001", "Alice", "alice@example.com", "S1001", "Computer Science");
        Faculty faculty = new Faculty("U002", "Dr. Bob", "bob@example.edu", "Math", "Professor");

        manager.displayAllItems();
        System.out.println();

        if (student.getBorrowedItemsCount() < student.getMaxBorrowLimit() && manager.borrowItem("B001", student.getName())) {
            student.addBorrowedItem(book1);
        }
        if (student.getBorrowedItemsCount() < student.getMaxBorrowLimit() && manager.borrowItem("D002", student.getName())) {
            student.addBorrowedItem(dvd2);
        }

        if (faculty.getBorrowedItemsCount() < faculty.getMaxBorrowLimit() && manager.borrowItem("M001", faculty.getName())) {
            faculty.addBorrowedItem(mag1);
        }
        if (faculty.getBorrowedItemsCount() < faculty.getMaxBorrowLimit() && manager.borrowItem("B002", faculty.getName())) {
            faculty.addBorrowedItem(book2);
        }
        System.out.println();

        manager.displayAvailableItems();
        System.out.println();

        student.displayBorrowedItems();
        faculty.displayBorrowedItems();
        System.out.println();

        manager.returnItem("B001");
        student.removeBorrowedItem(book1);
        System.out.println();
        manager.displayAllItems();
        System.out.println();

        int daysLate = 3;
        double totalFees = manager.calculateTotalLateFees(daysLate);
        System.out.printf("Total late fees for %d days late (all items): %.2f\n", daysLate, totalFees);
        System.out.println();

        System.out.println(dvd1.getBorrowingStatus());
        System.out.println();

        try {
            book1.setGenre("");
        } catch (IllegalArgumentException ex) {
            System.out.println("Caught validation error when setting genre: " + ex.getMessage());
        }
        try {
            dvd1.setRating("X");
        } catch (IllegalArgumentException ex) {
            System.out.println("Caught validation error when setting rating: " + ex.getMessage());
        }
        try {
            mag2.setIssueNumber(-5);
        } catch (IllegalArgumentException ex) {
            System.out.println("Caught validation error when setting issue number: " + ex.getMessage());
        }
    }
}
