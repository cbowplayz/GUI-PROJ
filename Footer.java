import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Adds a footer containing a logo and three buttons
public class Footer {

    // Footer components
    private JPanel footerPanel;
    private JLabel logoLabel;
    private JButton clearBtn;
    private JButton submitBtn;
    private JButton exitBtn;

    // Initializes footer omponents
    public Footer() {
        footerPanel = new JPanel(
            new FlowLayout(FlowLayout.CENTER, 10, 10)
        );

        logoLabel = new JLabel();
        logoLabel.setIcon(new ImageIcon("f1.png"));

        clearBtn = new JButton("Clear Text Area");
        submitBtn = new JButton("Submit");
        exitBtn = new JButton("Exit");

        // Adds logo and buttons to footer panel
        footerPanel.add(logoLabel);
        footerPanel.add(clearBtn);
        footerPanel.add(submitBtn);
        footerPanel.add(exitBtn);
    }

    public JPanel getFooterPanel() {
        return footerPanel;
    }

    public JButton getClearButton() {
        return clearBtn;
    }

    public JButton getSubmitButton() {
        return submitBtn;
    }

    public JButton getExitButton() {
        return exitBtn;
    }
}
