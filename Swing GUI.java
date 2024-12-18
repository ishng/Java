import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionGUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Addition of Two Numbers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Create components
        JLabel label1 = new JLabel("Enter first number:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Enter second number:");
        JTextField textField2 = new JTextField();
        JButton addButton = new JButton("Add");
        JLabel resultLabel = new JLabel("Result:");

        // Add ActionListener to the button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the numbers from the text fields
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    // Calculate the sum
                    double sum = num1 + num2;
                    // Display the result
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter numbers.");
                }
            }
        });

        // Add components to the frame
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(new JLabel()); // Empty placeholder
        frame.add(addButton);
        frame.add(resultLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
