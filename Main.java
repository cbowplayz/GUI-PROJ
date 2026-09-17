import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

// Authors: Mohammad Abdullah, Avnge George Lumilan, Christian Vera

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        // Main Window
        JFrame frame = new JFrame("F1 Race Outcome");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        /* Header Panel */
        Header header = new Header();
        frame.add(header.getHeaderPanel(), BorderLayout.NORTH);
        
        /* Center Panel */
        Center center = new Center();
        frame.add(center.getCenterPanel(), BorderLayout.CENTER);

        /* Footer Panel */
        Footer footer = new Footer();
        frame.add(footer.getFooterPanel(), BorderLayout.SOUTH);

        /* Event Listeners */
        // Update the display label with the content of the text field when updateBtn is clicked.
        header.getUpdateButton().addActionListener(e -> 
            center.getDisplayLabel().setText(header.getGreetingField().getText())
        );

        // Clear all text from textArea when clearBtn is clicked.
        footer.getClearButton().addActionListener(e -> 
            center.getTextArea().setText("")
        );

        // Exit the application
        footer.getExitButton().addActionListener(e ->
            System.exit(0)
        );

        footer.getSubmitButton().addActionListener (e -> {
            System.out.println(center.getFirstPlace().getText());
            System.out.println(center.getSecondPlace().getText());
            System.out.println(center.getThirdPlace().getText());
            System.out.println(center.getTextArea().getText());

        });
        
        frame.setVisible(true);
    }
}

