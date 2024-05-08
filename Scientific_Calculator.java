import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Class declaration
public class Calculating extends JFrame implements ActionListener {
    // Creating JTextField object
    private JTextField displayField;

    // Constructor
    public Calculating() {
        // Titling calculator
        setTitle("Cl - Calculator");
        // Setting close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null); // Center the frame
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.GRAY); // Set panel background color to grey

        // Creating and configuring text field
        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setBackground(Color.LIGHT_GRAY); // Set text field background color to light grey
        panel.add(displayField, BorderLayout.NORTH);

        // Creating and configuring button panel
        JPanel buttonPanel = new JPanel(new GridLayout(7, 5, 5, 5));
        buttonPanel.setBackground(Color.GRAY); // Set button panel background color to grey

        // Array of button labels
        String[] buttonLabels = {
                "7", "8", "9", "/", "C",
                "4", "5", "6", "*", "cos",
                "1", "2", "3", "-", "tan",
                "0", ".", "=", "+", "log",
                "sqrt", "ln", "10^", "1/n", "%",
                "x^2", "x^3", "abs", "sin", "acos",
                "asin"
        };

        // Creating buttons and adding them to button panel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            button.setBackground(Color.LIGHT_GRAY);
            buttonPanel.add(button);
        }

        // Adding button panel to main panel
        panel.add(buttonPanel, BorderLayout.CENTER);

        // Adding main panel to frame and making it visible
        add(panel);
        setVisible(true);
    }

    @Override
    // Action event handling method
    public void actionPerformed(ActionEvent e) {
        // Get the action command associated with the event
        String command = e.getActionCommand();
        // Check the action command
        if (command.equals("=")) {
            // Evaluate the expression if "=" button is clicked
            try {
                String expression = displayField.getText();
                double result = evaluate(expression);
                displayField.setText(Double.toString(result));
            } catch (Exception ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("sqrt")) {
            // Calculate square root if "sqrt" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.sqrt(operand)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("log")) {
            // Calculate logarithm if "log" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.log10(operand)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("ln")) {
            // Calculate natural logarithm if "ln" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.log(operand)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("10^")) {
            // Calculate 10 raised to the power if "10^" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.pow(10, operand)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("1/n")) {
            // Calculate reciprocal if "1/n" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                if (operand != 0) {
                    displayField.setText(Double.toString(1.0 / operand));
                } else {
                    displayField.setText("Error");
                }
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("%")) {
            // Calculate percentage if "%" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(operand / 100));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("x^2")) {
            // Calculate square if "x^2" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.pow(operand, 2)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("x^3")) {
            // Calculate cube if "x^3" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.pow(operand, 3)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("abs")) {
            // Calculate absolute value if "abs" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.abs(operand)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("sin")) {
            // Calculate sine if "sin" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.sin(operand)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("cos")) {
            // Calculate cosine if "cos" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.cos(operand)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("tan")) {
            // Calculate tangent if "tan" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.tan(operand)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("asin")) {
            // Calculate arcsine if "asin" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.asin(operand)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("acos")) {
            // Calculate arccosine if "acos" button is clicked
            try {
                double operand = Double.parseDouble(displayField.getText());
                displayField.setText(Double.toString(Math.acos(operand)));
            } catch (NumberFormatException ex) {
                // Handle errors
                displayField.setText("Error");
            }
        } else if (command.equals("C")) {
            // Clear the display if "C" button is clicked
            displayField.setText("");
        } else {
            // Append the command to the display
            displayField.setText(displayField.getText() + command);
        }
    }

    private double evaluate(String expression) {
        // Split the expression into operands and operator
        String[] parts = expression.split("(?<=[-+*/])|(?=[-+*/])");
        double operand1 = Double.parseDouble(parts[0]);
        double operand2 = Double.parseDouble(parts[2]);
        String operator = parts[1];

        // Perform the operation based on the operator
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    public static void main(String[] args) {
        new Calculating();
    }
}
