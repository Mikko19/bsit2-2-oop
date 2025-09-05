import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOrder {
    public static void main(String[] args) {
        System.out.println("═══ Food Ordering System ═══\n");

        Order order1 = new Order("Alice Johnson");
        Order order2 = new Order("Bob Smith");
        Order order3 = new Order("Charlie Brown");

        try {
            order1.addItem("Pizza", 12.99);
            order1.addItems(Arrays.asList("Burger", "Fries"), Arrays.asList(8.50, 3.25));

            order2.addItem("Pasta", 10.00);
            order2.addItems(Arrays.asList("Salad", "Soup"), Arrays.asList(5.50, 4.00));

            order3.addItem("Steak", -15.00);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order3.addItem("", 8.00);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order3.addItems(Arrays.asList("Sandwich", "Juice"), Arrays.asList(6.00));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nOrder Results:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        List<Order> orders = Arrays.asList(order1, order2, order3);

        int totalOrders = orders.size();
        Order largestOrder = Collections.max(orders, Comparator.comparingDouble(Order::getTotal));

        System.out.println("\nTotal orders created: " + totalOrders);
        System.out.println("Largest order: " + largestOrder.getCustomerName() +
                " ($" + String.format("%.2f", largestOrder.getTotal()) + ")");
    }
}