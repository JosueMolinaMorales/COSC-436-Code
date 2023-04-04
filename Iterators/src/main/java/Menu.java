import java.util.ArrayList;

public class Menu {
    public static final int APPETIZERS = 1;
    public static final int MAIN_DISH = 2;
    public static final int DESSERT = 3;
    public static final boolean HEART_HEALTHY = true;
    public static final boolean NOT_HEART_HEALTHY = false;
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public void add(MenuItem item) {
        this.menuItems.add(item);
    }

    private class AllMenuItemIterator implements MenuIterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public MenuItem next() {
            return null;
        }
    }

    private class ItemIterator implements MenuIterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public MenuItem next() {
            return null;
        }
    }

    private class HeartHealthyIterator implements MenuIterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public MenuItem next() {
            return null;
        }
    }

    private class PriceIterator implements MenuIterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public MenuItem next() {
            return null;
        }
    }
}
