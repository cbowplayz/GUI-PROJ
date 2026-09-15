import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Center {

    private JPanel centerPanel = null;
    private JTextArea textArea = null;
    private RichJLabel displayLabel = null;

    public Center() {

        centerPanel = new JPanel(new BorderLayout(10, 10));

        // F1 TITLE

        displayLabel = new RichJLabel("F1 GRAND PRIX", 1);
        displayLabel.setFont(
            displayLabel.getFont().deriveFont(Font.BOLD, 24f)
        );

        displayLabel.setForeground(Color.BLACK);

        displayLabel.setLeftShadow(2, 2, Color.GRAY);
        displayLabel.setRightShadow(1, 1, Color.LIGHT_GRAY);

        centerPanel.add(displayLabel, BorderLayout.NORTH);

        // podium

        JPanel podiumPanel = new JPanel(new GridBagLayout());


       // 1st Place
        JTextArea firstPlace = createDriverBox(
            "1ST PLACE\n\nDriver 1"
        );

        GridBagConstraints firstGbc = new GridBagConstraints();

        firstGbc.gridx = 1;
        firstGbc.gridy = 1;
        firstGbc.gridheight = 2;
        firstGbc.weightx = 1.0;
        firstGbc.weighty = 1.0;
        firstGbc.fill = GridBagConstraints.BOTH;
        firstGbc.insets = new Insets(5, 5, 5,5);

        podiumPanel.add(firstPlace,firstGbc);


        // 2nd Place
        JTextArea secondPlace = createDriverBox(
            "2ND PLACE\n\nDriver 2"
        );

        GridBagConstraints secondGbc = new GridBagConstraints();

        secondGbc.gridx = 0;
        secondGbc.gridy = 1;
        secondGbc.weightx = 1.0;
        secondGbc.weighty = 0.5;
        secondGbc.fill = GridBagConstraints.BOTH;
        secondGbc.insets = new Insets(5, 5, 5, 5);
        podiumPanel.add(secondPlace,secondGbc);

        // 3rd Place
        JTextArea thirdPlace = createDriverBox(
            "3RD PLACE\n\nDriver 3"
        );

        GridBagConstraints thirdGbc = new GridBagConstraints();

        thirdGbc.gridx = 2;
        thirdGbc.gridy = 1;
        thirdGbc.weightx = 1.0;
        thirdGbc.weighty = 0.5;
        thirdGbc.fill = GridBagConstraints.BOTH;
        thirdGbc.insets = new Insets(5, 5, 5, 5);
        podiumPanel.add(thirdPlace,thirdGbc);


        // rest of grid

        textArea = new JTextArea(
            "REST OF THE FIELD\n\n" +
            "4. Driver 4\n" +
            "5. Driver 5\n" +
            "6. Driver 6\n" +
            "7. Driver 7\n" +
            "8. Driver 8\n" +
            "9. Driver 9\n" +
            "10. Driver 10"
        );

        textArea.setEditable(true);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        textArea.setFont(
            textArea.getFont().deriveFont(Font.PLAIN, 14f)
        );

        textArea.setBorder(
            BorderFactory.createLineBorder(Color.BLACK, 2)
        );


        // combo podium n field
        JPanel racePanel = new JPanel(new BorderLayout(10, 10));

        racePanel.add(podiumPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(textArea);
        racePanel.add(scrollPane, BorderLayout.CENTER);

        centerPanel.add(racePanel, BorderLayout.CENTER);
    }

    // podium

    private JTextArea createDriverBox(String text) {

        JTextArea area = new JTextArea(text);

        area.setEditable(true);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);

        area.setFont(
            area.getFont().deriveFont(Font.BOLD, 14f)
        );

        area.setBorder(
            BorderFactory.createLineBorder(Color.BLACK, 2)
        );

        return area;
    }

    // getters

    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public RichJLabel getDisplayLabel() {
        return displayLabel;
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}
