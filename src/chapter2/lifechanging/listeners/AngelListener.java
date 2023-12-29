package chapter2.lifechanging.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Angel listener, who is an Observer to the button.
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
