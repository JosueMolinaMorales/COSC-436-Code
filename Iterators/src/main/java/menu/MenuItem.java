package menu;

public class MenuItem {
    private String name;
    private MenuCategory category;
    private boolean heartHealthy;
    private float price;

    public MenuItem(String name, MenuCategory category, boolean heartHealthy, float price) {
        this.name = name;
        this.category = category;
        this.heartHealthy = heartHealthy;
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public String toString() {
        return "Name: " + this.name +
                "\nCategory: " + this.category +
                "\nHeart Healthy: " + this.heartHealthy +
                "\nPrice: " + this.price;
    }
}
