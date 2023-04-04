package menu;

import java.util.ArrayList;

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

    public MenuIterator getAllItemIterator() {
        return new AllMenuItemIterator();
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

    // TODO
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

    // TODO
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

    // TODO
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
