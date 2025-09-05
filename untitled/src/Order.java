import java.util.*;

public class Order {
    private String customerName;
    private List<String> items;
    private List<Double> prices;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public void addItem(String item, double price) throws Exception {
        if (item == null || item.trim().isEmpty()) {
            throw new Exception("Invalid item: cannot be empty");
        }
        if (price <= 0) {
            throw new Exception("Invalid price: must be greater than 0");
        }
        items.add(item);
        prices.add(price);
    }

    public void addItems(List<String> newItems, List<Double> newPrices) throws Exception {
        if (newItems.size() != newPrices.size()) {
            throw new Exception("Items and prices count mismatch");
        }
        for (int i = 0; i < newItems.size(); i++) {
            addItem(newItems.get(i), newPrices.get(i));
        }
    }

    public double getTotal() {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

    public String getSize() {
        int count = items.size();
        if (count == 0) return "Empty order";
        if (count <= 3) return "Small";
        if (count <= 5) return "Medium";
        return "Large";
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getItemCount() {
        return items.size();
    }

    @Override
    public String toString() {
        return "Order for " + customerName + ": " + items.size() +
                " items, Total: $" + String.format("%.2f", getTotal()) +
                ", Size: " + getSize();
    }
}



