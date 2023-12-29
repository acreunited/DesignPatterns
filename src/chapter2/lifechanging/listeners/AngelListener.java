package chapter2.lifechanging.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Angel listener.
 */
public class AngelListener implements ActionListener {

    /**
     * Instantiates a new Angel listener.
     */
    public AngelListener() {
        // empty
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Don't do it, you might regret it!");
    }
}
