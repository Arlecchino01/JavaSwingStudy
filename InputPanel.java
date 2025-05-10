import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel {
    private JTextField textField;
    private JButton submitButton;
    private InputCallback currentCallback;

    public InputPanel() {
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        submitButton = new JButton("입력");

        add(new JLabel("입력: "));
        add(textField);
        add(submitButton);

        submitButton.addActionListener(e -> {
            if (currentCallback != null) {
                String input = textField.getText().trim();
                textField.setText("");
                currentCallback.onInput(input);
                currentCallback = null;
            }
        });
    }

    public void requestInput(InputCallback callback) {
        this.currentCallback = callback;
    }
}