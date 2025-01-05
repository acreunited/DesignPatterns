package chapter9.java_iterator.iterator;

import chapter9.java_iterator.MenuItem;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {

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

    @Override
    public void remove() {
        throw new UnsupportedOperationException("You shouldn't be trying to remove menu items");
    }
}
