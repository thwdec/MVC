package A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BrownCowView {

    public String id;
    public String color;
    public int ageyear;
    public static int agemoth;
    public int countMilk;
    public static boolean BSOD;

    public void WhiCow() {
        // Create the frame
        JFrame frame = new JFrame("bCow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
       

        // Create a label to display text
        JLabel label = new JLabel("");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton button1 = new JButton("milk");


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // almod milk
                int randomNum = (int)(Math.random() * 101);
                if (randomNum >= (ageyear)){
                    label.setText("get milk");
                }
                else {
                    label.setText("get almond milk");
                    BSOD = true;
            }
              
            }
        });

        // Create a panel and add buttons to it
        JPanel panel = new JPanel();
        panel.add(button1);

        // Add the panel and label to the frame
        frame.add(panel, BorderLayout.SOUTH);
        frame.add(label, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }

    public void thisCow(String id) {
        this.id = id;
        this.color = color;
        this.ageyear = ageyear;
        this.agemoth = agemoth;
        this.countMilk = countMilk;
        this.BSOD = BSOD;
    }
}
