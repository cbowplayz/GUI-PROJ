import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Author: Avnge George Lumilan

public class Header {
    
    private JPanel headerPanel = null;
    private JPanel imagePanel = null;

    private JLabel imageLabel = null;
    private JLabel greetingLabel = null;

    private JTextField greetingField = null;
    private JButton updateBtn = null;


    // Default Constructor
    public Header() {
        headerPanel = new JPanel(new BorderLayout(10, 10));
        
        // Image Panel
        imagePanel = new JPanel();
        ImageIcon f1Image = new ImageIcon("images/f2.png");
        imageLabel = new JLabel(f1Image);
        imagePanel.add(imageLabel);
        headerPanel.add(imagePanel, BorderLayout.NORTH);
        
        // Input panel
        JPanel inputPanel =
            new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        greetingLabel = new JLabel("Grand Prix:");
        greetingField = new JTextField(20);
        greetingField.setText("Enter race name");

        updateBtn = new JButton("Submit");

        inputPanel.add(greetingLabel);
        inputPanel.add(greetingField);
        inputPanel.add(updateBtn);

        headerPanel.add(inputPanel, BorderLayout.SOUTH);
    }

    // New constructor with parameters
    public Header(String labelText, 
                String fieldText, 
                String buttonText) {

        headerPanel = new JPanel(new BorderLayout(10, 10));
        // Image Panel
        imagePanel = new JPanel();
        ImageIcon f1Image = new ImageIcon("images/f2.png");
        imageLabel = new JLabel(f1Image);
        imagePanel.add(imageLabel);
        headerPanel.add(imagePanel, BorderLayout.NORTH);

        // Input panel 
        JPanel inputPanel =
            new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        greetingLabel = new JLabel(labelText);
        greetingField = new JTextField(20);
        greetingField.setText(fieldText);

        updateBtn = new JButton(buttonText);
        // Add components to the input panel
        inputPanel.add(greetingLabel);
        inputPanel.add(greetingField);
        inputPanel.add(updateBtn);
        headerPanel.add(inputPanel, BorderLayout.SOUTH);
        }
    
    // Setters for the text of the label, text field, and button
    public void setGreetingLabelText(String text) {
        greetingLabel.setText(text);
    }
    public void setGreetingFieldText(String text) {
        greetingField.setText(text);
    }
    public void setUpdateButtonText(String text) {
        updateBtn.setText(text);
    }
    public void setHeaderImage(String imagePath) {
        ImageIcon newImage = new ImageIcon(imagePath);
        imageLabel.setIcon(newImage);
    }

    // Getters for the header panel, label, text field, and button
    public JPanel getHeaderPanel() {
        return headerPanel;
    }
    public JLabel getGreetingLabel() {
        return greetingLabel;
    }
    public JTextField getGreetingField() {
        return greetingField;
    }
    public JButton getUpdateButton() {
        return updateBtn;
    }
}