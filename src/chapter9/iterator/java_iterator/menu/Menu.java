package chapter9.iterator.java_iterator.menu;

import chapter9.iterator.java_iterator.MenuItem;

import java.util.Iterator;

public interface Menu {

    Iterator<MenuItem> createIterator();
}
