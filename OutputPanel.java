import javax.swing.*;
import java.awt.*;

public class OutputPanel extends JPanel {
    private JTextArea textArea;

    public OutputPanel() {
        setLayout(new BorderLayout());
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void print(String message) {
        textArea.append(message + "\n");
    }
}