import javax.swing.*;

public class Notepad {
    private static Notepad instance;

    private Notepad() {
        // Private Constructor
		
		JFrame frame = new JFrame("Notepad");
        JTextArea textArea = new JTextArea();
        frame.add(textArea);
        frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static Notepad getInstance() {
        if (instance == null) {
            instance = new Notepad();
        }
        return instance;
    }
}