package chapter2.lifechanging;

import chapter2.lifechanging.listeners.AngelListener;
import chapter2.lifechanging.listeners.DevilListener;

import javax.swing.*;

public class SwingObserverExample {

    private JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        this.frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
    }
}
