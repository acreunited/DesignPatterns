package chapter9.iterator.java_iterator;

/**
 * The type Menu item.
 */
//TODO - could be a Record
public class MenuItem {

    private String name;

    private String description;

    private boolean vegetarian;

    private double price;

    /**
     * Instantiates a new Menu item.
     *
     * @param name        the name
     * @param description the description
     * @param vegetarian  the vegetarian
     * @param price       the price
     */
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Is vegetarian boolean.
     *
     * @return the boolean
     */
    public boolean isVegetarian() {
        return this.vegetarian;
    }

    /**
     * Sets vegetarian.
     *
     * @param vegetarian the vegetarian
     */
    public void setVegetarian(final boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.price + " -- " + this.description;
    }
}
