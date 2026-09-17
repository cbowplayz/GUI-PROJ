import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Author: Mohammad Abdullah

// Adds a footer containing a logo and three buttons
public class Footer {

    // Footer components
    private JPanel footerPanel = null;
    private JLabel logoLabel = null;
    private JButton clearBtn = null;
    private JButton submitBtn = null;
    private JButton exitBtn = null;

    // Initializes footer omponents
    public Footer() {
        footerPanel = new JPanel(
            new FlowLayout(FlowLayout.CENTER, 10, 10)
        );

        logoLabel = new JLabel();
        logoLabel.setIcon(new ImageIcon("images/f1.png"));

        clearBtn = new JButton("Clear Text Area");
        submitBtn = new JButton("Submit");
        exitBtn = new JButton("Exit");

        // Adds logo and buttons to footer panel
        footerPanel.add(logoLabel);
        footerPanel.add(submitBtn);
        footerPanel.add(clearBtn);
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
