package chapter2.lifechanging.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Devil listener, who is an Observer to the button.
 */
public class DevilListener implements ActionListener {

    /**
     * Instantiates a new Devil listener.
     */
    public DevilListener() {
        // empty
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Come on, do it!");
    }
}
