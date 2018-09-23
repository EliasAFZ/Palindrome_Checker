import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * View handles all GUI related tasks
 * @author Elias
 */
public class view extends JFrame {

    private JTextField userInput = new JTextField(20);
    private JButton submitButton = new JButton("Submit");
    
    /**
     * Constructs the GUI
     */
    view() {
        JPanel viewPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 100);
        viewPanel.add(userInput);
        viewPanel.add(submitButton);
        this.add(viewPanel);
        this.setTitle("Palindrome Checker");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * returns user submitted text
     * @return userInput.getText();
     */
    public String getUserInput() {
        return userInput.getText();
    }

    /**
     * listens for when the submit button is clicked
     */
    void addViewButtonListener(ActionListener listenForSubmitButton) {
        submitButton.addActionListener(listenForSubmitButton);
    }

    /**
     * displays an error message if an exception is thrown
     */
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    /**
     * displays an answer to whether or not a palindrome is detected
     */
    void displayAnswer(Boolean palinCheckAnswer) {
        JOptionPane.showMessageDialog(this, palinCheckAnswer);
    }
}
