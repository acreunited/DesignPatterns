package chapter9.java_iterator.menu;

import chapter9.java_iterator.MenuItem;

import java.util.Iterator;

public interface Menu {

    Iterator<MenuItem> createIterator();
}
