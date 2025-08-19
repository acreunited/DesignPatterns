package chapter11.protection_proxy.invocation;

import chapter11.protection_proxy.profile.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * The invocation handler for the own profile
 */
public class OwnerInvocationHandler implements InvocationHandler {

    /**
     * The person
     */
    private final Person person;

    /**
     * Constructor
     *
     * @param person the person
     */
    public OwnerInvocationHandler(final Person person) {
        this.person = person;
    }

    /**
     * Gets called everytime a method is invoked on a proxy
     * If the method is a getter, we go ahead and invoke it on the real subject
     * But ,if is it setGeekRanking() method, we don0t allowed it to happen by throwing IllegalAccessException
     *
     * @param proxy  the proxy instance that the method was invoked on
     * @param method the {@code Method} instance corresponding to
     *               the interface method invoked on the proxy instance.  The declaring
     *               class of the {@code Method} object will be the interface that
     *               the method was declared in, which may be a superinterface of the
     *               proxy interface that the proxy class inherits the method through.
     * @param args   an array of objects containing the values of the
     *               arguments passed in the method invocation on the proxy instance,
     *               or {@code null} if interface method takes no arguments.
     *               Arguments of primitive types are wrapped in instances of the
     *               appropriate primitive wrapper class, such as
     *               {@code java.lang.Integer} or {@code java.lang.Boolean}.
     * @return the method invokation or an error if there's no legal access to it
     * @throws IllegalAccessException when the own person cannot invoke the method, like setting its own ranking
     */
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(this.person, args);
            }

            if ("setGeekRating".equals(method.getName())) {
                throw new IllegalAccessException("You can't set your own ranking!");
            }

            if (method.getName().startsWith("set")) {
                return method.invoke(this.person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}