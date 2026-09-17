import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


// Author: Christian Vera

public class Center {

    private JPanel centerPanel = null;
    private JTextArea textArea = null;
    private RichJLabel displayLabel = null;
    private JTextArea firstPlace = null;
    private JTextArea secondPlace = null;
    private JTextArea thirdPlace = null;


    public Center() {

        centerPanel = new JPanel(new BorderLayout(50, 50));

        // F1 TITLE

        displayLabel = new RichJLabel("F1 GRAND PRIX", 1);
        displayLabel.setFont(
            displayLabel.getFont().deriveFont(Font.BOLD, 24f)
        );

        displayLabel.setForeground(Color.RED);

        displayLabel.setLeftShadow(2, 2, Color.GRAY);
        displayLabel.setRightShadow(1, 1, Color.LIGHT_GRAY);

        centerPanel.add(displayLabel, BorderLayout.NORTH);

        // podium

        JPanel podiumPanel = new JPanel(new BorderLayout(10,10));
        podiumPanel.setPreferredSize(new Dimension(180,180));


       // 1st Place
        firstPlace = createDriverBox(
            "1ST PLACE\n\nDriver 1\n\n"
        );

        JPanel firstPlacePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        firstPlace.setPreferredSize(new Dimension(180, 180));
        firstPlacePanel.add(firstPlace);

        podiumPanel.add(firstPlacePanel, BorderLayout.CENTER);


        // 2nd Place
        JPanel lowerPodium = new JPanel(new BorderLayout(10,10));

        secondPlace = createDriverBox(
            "2ND PLACE\n\nDriver 2\n\n"
        );
        
        lowerPodium.add(secondPlace, BorderLayout.WEST);

        // 3rd Place
        thirdPlace = createDriverBox(
            "3RD PLACE\n\nDriver 3\n\n"
        );

        lowerPodium.add(thirdPlace, BorderLayout.EAST);

        podiumPanel.add(lowerPodium, BorderLayout.SOUTH);

        // rest of grid

        textArea = new JTextArea(
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

    public JTextArea getFirstPlace () {
        return firstPlace;

    }

    public JTextArea getSecondPlace (){
        return secondPlace;
    }

    public JTextArea getThirdPlace (){
        return thirdPlace;
    }


}
