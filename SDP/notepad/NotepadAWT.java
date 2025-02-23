// NotepadAWT.java
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class NotepadAWT extends Frame {
    private static final long serialVersionUID = 1L;
    private TextArea textArea;
    private MenuBar menuBar;
    private Menu fileMenu;
    private MenuItem openItem;
    private MenuItem saveItem;

    private NotepadAWT() {
        setTitle("Notepad AWT");
        setSize(500, 500);
        textArea = new TextArea();
        menuBar = new MenuBar();
        fileMenu = new Menu("File");
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        menuBar.add(fileMenu);

        setMenuBar(menuBar);
        add(textArea);

        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open file logic
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Save file logic
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

   
}
