package chapter11.protection_proxy.invocation;

import chapter11.protection_proxy.profile.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * The invocation handler for another person's profile
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

    /**
     * The person
     */
    private final Person person;

    /**
     * Constructor
     *
     * @param person the person
     */
    public NonOwnerInvocationHandler(final Person person) {
        this.person = person;
    }

    /**
     * Gets called everytime a method is invoked on a proxy
     * If the method is a getter, we go ahead and invoke it on the real subject
     * But ,if it's a setter() method, we don't allowed it to happen by throwing IllegalAccessException.
     * Unless its setGeekRating, since people cant set other people's ranking
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
     * @return the method
     * @throws IllegalAccessException if the other person cannot access
     */
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(this.person, args);
            }

            if ("setGeekRating".equals(method.getName())) {
                return method.invoke(this.person, args);
            }

            if (method.getName().startsWith("set")) {
                throw new IllegalAccessException("You cannot set other people's information!");
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}