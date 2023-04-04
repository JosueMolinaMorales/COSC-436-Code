public class MenuItem {
    private String name;
    private String category;
    private boolean heartHealthy;
    private float price;

    public MenuItem(String name, String category, boolean heartHealthy, float price) {
        this.name = name;
        this.category = category;
        this.heartHealthy = heartHealthy;
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
}
