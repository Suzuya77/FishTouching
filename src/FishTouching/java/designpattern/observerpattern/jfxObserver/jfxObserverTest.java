package FishTouching.java.designpattern.observerpattern.jfxObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jfxObserverTest {
    JFrame jFrame;

    public static void main(String[] args) {
        jfxObserverTest example = new jfxObserverTest();
        example.go();
    }

    public void go(){
        jFrame = new JFrame("Test");
        jFrame.setSize(800,600);

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
        jFrame.setVisible(true);
    }

    class AngelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't you fucking do it!");
        }
    }

    class DevilListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Just fucking do it!");
        }
    }
}
