public class Run {
    private static int count = 0;
    private static String[] answers = new String[3];

    public static void main(String[] args) {
        InputPanel inputPanel = new InputPanel();
        OutputPanel outputPanel = new OutputPanel();
        new MainFrame(inputPanel, outputPanel);

        runGame(inputPanel, outputPanel);
    }

    private static void runGame(InputPanel inputPanel, OutputPanel outputPanel) {
        askNext(inputPanel, outputPanel);
    }

    private static void askNext(InputPanel inputPanel, OutputPanel outputPanel) {
        if (count >= 3) {
            outputPanel.print("모든 입력 완료!");
            return;
        }

        outputPanel.print((count + 1) + "번째 숫자를 입력하세요:");
        inputPanel.requestInput(value -> {
            answers[count] = value;
            outputPanel.print("입력 " + (count + 1) + ": " + value);
            count++;
            askNext(inputPanel, outputPanel);
        });
    }
}