package chapter8.compare;

/**
 * Class of a Duck that is able to Compare it
 */
public class Duck implements Comparable<Duck> {

    /**
     * The name of the Duck
     */
    private final String name;

    /**
     * How much the Duck weights
     */
    private final int weight;


    /**
     * Instantiates a new Duck.
     *
     * @param name   the name
     * @param weight the weight
     */
    public Duck(final String name, final int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(final Duck duck) {
        return Integer.compare(this.weight, duck.getWeight());

    }

    /**
     * Gets the weights of the Duck
     *
     * @return the weight of the duck
     */
    private int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + " weights " + this.weight;
    }
}
