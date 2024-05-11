import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewFrame extends JDialog {
    private JPanel contentPane;
    private JTextField fileTextField;
    private JButton openButton;
    private JScrollBar scrollBar1;
    private JTextArea contentTextArea;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JFileChooser fileChooser;

    public NewFrame() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser = new JFileChooser();
                JButton button = (JButton)e.getSource();
                Window window = SwingUtilities.windowForComponent( button );
                if (fileChooser.showOpenDialog(window) == JFileChooser.APPROVE_OPTION) {
                    fileTextField.setText(fileChooser.getSelectedFile().toString());
                    FileInputStream fis = null;
                    try {
                        fis = new FileInputStream(fileChooser.getSelectedFile());
                        String str = "";
                        while (fis.available() > 0) {
                            str += (char) fis.read();
                        }
                        contentTextArea.setText(str);
                        fis.close();
                    } catch (FileNotFoundException ex) {
                        System.err.println("File tidak ditemukan");
                    } catch (IOException ex) {
                        System.err.println("File gagal dibaca");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        NewFrame dialog = new NewFrame();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
