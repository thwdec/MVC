package A;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView {

    public void mainview() {
        // Create the frame
        JFrame frame = new JFrame("Data Entry Form");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create labels
        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(10, 20, 80, 25);
        frame.add(idLabel);

        // Create text fields
        JTextField idField = new JTextField();
        idField.setBounds(100, 20, 165, 25);
        frame.add(idField);

        // Create submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(10, 75, 255, 25);
        frame.add(submitButton);

        // Add action listener to the button
        submitButton.addActionListener(new ActionListener() {
            
            Model model = new Model();
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();

                // Check if ID is a number
                if (isNumeric(id) && id.charAt(0) != '0' && id.length() == 8) {
                    JOptionPane.showMessageDialog(frame,
                            "ID: " + id + "\n",
                            "Data Submitted",
                            JOptionPane.INFORMATION_MESSAGE);
                    //check id in data
                    if (model.check(id)) {
                        JOptionPane.showMessageDialog(frame,
                    model.getCow(id),"ID",JOptionPane.INFORMATION_MESSAGE);
                    WhiteCowView c1 = new WhiteCowView();
                    c1.thisCow(id);
                    }
                    //dont have data
                    else  JOptionPane.showMessageDialog(frame,
                    "Invalid ID. Please enter a correct ID.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

                    
                } else {
                    JOptionPane.showMessageDialog(frame,
                            "Invalid ID. Please enter a correct format.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    idField.setText(""); // Clear the field
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

 
    private  boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}