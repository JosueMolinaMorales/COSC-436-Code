package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static final boolean HEART_HEALTHY = true;
    public static final boolean NOT_HEART_HEALTHY = false;
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public void add(MenuItem item) {
        this.menuItems.add(item);
    }

    public void delete(MenuIterator itr) {
        if (itr instanceof AllMenuItemIterator) {
            int index = ((AllMenuItemIterator) itr).currIndex - 1;
            this.menuItems.remove(index);
        }
    }

    public MenuIterator getAllItemIterator() {
        return new AllMenuItemIterator();
    }

    public MenuIterator getItemIterator(MenuCategory category) {
        return new ItemIterator(category);
    }

    public MenuIterator getHeartHealthyIterator() {
        return new HeartHealthyIterator();
    }

    public MenuIterator getPriceIterator(float price) {
        return new PriceIterator(price);
    }
    private class AllMenuItemIterator implements MenuIterator {
        private int currIndex = 0;

        @Override
        public boolean hasNext() {
            return this.currIndex < menuItems.size();
        }

        @Override
        public MenuItem next() {
            MenuItem next = menuItems.get(currIndex);
            currIndex++;
            return next;
        }
    }
    private class ItemIterator implements MenuIterator {
        private int currIdx = 0;
        private final List<MenuItem> filtered;

        public ItemIterator(MenuCategory type) {
            this.filtered = menuItems.stream().filter(p -> p.getCategory() == type).toList();
        }

        @Override
        public boolean hasNext() {
            return this.currIdx < filtered.size();
        }

        @Override
        public MenuItem next() {
            return this.filtered.get(this.currIdx++);
        }

    }

    private class HeartHealthyIterator implements MenuIterator {

        private int currIdx = 0;
        private final List<MenuItem> filtered;

        public HeartHealthyIterator() {
            this.filtered = menuItems.stream().filter(MenuItem::getHeartHealthy).toList();
        }

        @Override
        public boolean hasNext() {
            return this.currIdx < filtered.size();
        }

        @Override
        public MenuItem next() {
            return this.filtered.get(this.currIdx++);
        }
    }

    private class PriceIterator implements MenuIterator {

        private int currIdx = 0;
        private final List<MenuItem> filtered;

        public PriceIterator(float price) {
            this.filtered = menuItems.stream().filter(mi -> mi.getPrice() < price).toList();
        }

        @Override
        public boolean hasNext() {
            return this.currIdx < filtered.size();
        }

        @Override
        public MenuItem next() {
            return this.filtered.get(this.currIdx++);
        }
    }
}
