package chapter11.protection_proxy.runner;

import chapter11.protection_proxy.invocation.NonOwnerInvocationHandler;
import chapter11.protection_proxy.invocation.OwnerInvocationHandler;
import chapter11.protection_proxy.profile.Person;
import chapter11.protection_proxy.profile.PersonImpl;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Match making test drive.
 */
public class MatchMakingTestDrive {
    /**
     * The Dating db.
     */
    private final Map<String, Person> datingDB = new HashMap<>(2);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(final String[] args) {
        final MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    /**
     * Instantiates a new Match making test drive.
     */
    private MatchMakingTestDrive() {
        initializeDatabase();
    }

    /**
     * Drive.
     */
    private void drive() {
        final Person joe = getPersonFromDatabase("Joe Javabean");
        final Person ownerProxy = getOwnerProxy(joe);
        System.out.printf("Name is %s%n", ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.printf("Rating is %d%n", ownerProxy.getGeekRating());

        final Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.printf("Name is %s%n", nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.printf("Rating is %d%n", nonOwnerProxy.getGeekRating());
    }

    /**
     * Gets owner proxy.
     *
     * @param person the person
     * @return the owner proxy
     */
    private Person getOwnerProxy(final Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    /**
     * Gets non owner proxy.
     *
     * @param person the person
     * @return the non owner proxy
     */
    private Person getNonOwnerProxy(final Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    /**
     * Gets person from database.
     *
     * @param name the name
     * @return the person from database
     */
    private Person getPersonFromDatabase(final String name) {
        return this.datingDB.get(name);
    }

    /**
     * Initialize database.
     */
    void initializeDatabase() {
        final Person joe = new PersonImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setGeekRating(7);
        this.datingDB.put(joe.getName(), joe);

        final Person kelly = new PersonImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setGeekRating(6);
        this.datingDB.put(kelly.getName(), kelly);
    }
}