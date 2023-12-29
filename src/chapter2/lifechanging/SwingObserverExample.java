package chapter2.lifechanging;

import chapter2.lifechanging.listeners.AngelListener;
import chapter2.lifechanging.listeners.DevilListener;

import javax.swing.*;

/**
 * Class to run our Swing application.
 */
public class SwingObserverExample {

    /**
     * The frame
     */
    private JFrame frame;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    /**
     * Builds the application
     */
    private void go() {
        this.frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        //we can also use lambda functions as our Observers
        button.addActionListener(event -> System.out.println("I'm a lambda function, just do what you want"));

        this.frame.add(button);

        this.frame.setVisible(true);
    }
}
