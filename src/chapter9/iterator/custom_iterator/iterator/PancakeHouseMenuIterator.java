package chapter9.iterator.custom_iterator.iterator;

import chapter9.iterator.custom_iterator.MenuItem;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    private List<MenuItem> items;

    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = this.items.get(this.position);
        this.position++;
        return menuItem;
    }

    public boolean hasNext() {
        return this.position < this.items.size();
    }
}
