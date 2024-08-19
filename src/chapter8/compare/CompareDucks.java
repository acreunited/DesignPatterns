package chapter8.compare;

import common.utils.LogUtils;

import java.util.Arrays;

/**
 * Runs the Comparable Ducks
 */
public final class CompareDucks {

    /**
     * Private empty constructor
     */
    private CompareDucks() {
        // empty
    }

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(final String[] args) {
        final Duck[] ducks = {
                new Duck("A", 8),
                new Duck("B", 1),
                new Duck("C", 56),
                new Duck("D", 4),
        };
        LogUtils.logArray(ducks);
        Arrays.sort(ducks);
        System.out.println("After sorting");
        LogUtils.logArray(ducks);
    }
}
