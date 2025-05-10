import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private InputPanel inputPanel;
    private OutputPanel outputPanel;

    public MainFrame(InputPanel inputPanel, OutputPanel outputPanel) {
        this.inputPanel = inputPanel;
        this.outputPanel = outputPanel;

        setTitle("입출력 샘플");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(inputPanel, BorderLayout.NORTH);
        add(outputPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}