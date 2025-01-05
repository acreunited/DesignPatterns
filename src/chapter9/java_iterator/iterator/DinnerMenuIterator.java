package chapter9.java_iterator.iterator;

import chapter9.java_iterator.MenuItem;

public class DinnerMenuIterator implements Iterator {

    private MenuItem[] items;

    private int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.items.length && this.items[this.position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.items[this.position];
        this.position++;
        return menuItem;
    }
}
