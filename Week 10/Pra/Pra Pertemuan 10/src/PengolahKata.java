import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class PengolahKata {
    private JPanel mainPanel;
    private JTextArea txtTextArea;
    private JButton prosesButton;
    private JButton clearButton;
    private JButton saveButton;
    private JTextField rowTextField;
    private JTextField charTextField;
    private JTextField vowalTextField;
    private JTextField consonantTextField;
    private JLabel jmlCharLabel;
    private JLabel jmlRowLabel;
    private JLabel jmlVowalLabel;
    private JLabel jmlConsonantLabel;
    private JMenu fileMenu;
    private JMenuItem openFileMenu;
    private JMenuItem saveFileMenu;

    public PengolahKata() {
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTextArea.setText("");
                charTextField.setText("");
                rowTextField.setText("");
                vowalTextField.setText("");
                consonantTextField.setText("");
            }
        });
        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int jmlChar = 0, jmlRow, jmlVowal=0, jmlConsonant=0;
                String text=txtTextArea.getText();;

                jmlRow= txtTextArea.getLineCount();

                String tmpText=(text.replaceAll("\\s","")).toLowerCase();
                if (tmpText.equals(""))
                    jmlRow=0;
                else {
                    for (int i = 0; i < tmpText.length(); i++) {
                        char x=tmpText.charAt(i);

                        jmlChar++;
                        if (x>96 && x<123){
                            if (x=='a'||x=='i'||x=='u'||x=='e'||x=='o')
                                jmlVowal++;
                            else jmlConsonant++;
                        }
                    }
                }

                charTextField.setText(String.valueOf(jmlChar));
                rowTextField.setText(String.valueOf(jmlRow));
                vowalTextField.setText(String.valueOf(jmlVowal));
                consonantTextField.setText(String.valueOf(jmlConsonant));
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str="Hasil Proses Text\n"+
                        "=================\n"+
                        jmlCharLabel.getText()+" : "+charTextField.getText()+"\n"+
                        jmlRowLabel.getText()+" : "+rowTextField.getText()+"\n"+
                        jmlVowalLabel.getText()+" : "+vowalTextField.getText()+"\n"+
                        jmlConsonantLabel.getText()+" : "+consonantTextField.getText()+"\n";

                JFileChooser fc=new JFileChooser(new File("c:\\"));
                fc.setSelectedFile(new File("Hasil Proses.txt"));
                fc.setFileFilter(new FileNameExtensionFilter("Text File (*.txt)","txt"));
                fc.showSaveDialog(null);

                File file=fc.getSelectedFile();
                try {
                    String textFile=file.getCanonicalPath();
                    Files.writeString(Path.of(textFile),str,StandardCharsets.UTF_8);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        openFileMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                txtTextArea.setLineWrap(true);
                JFileChooser fc=new JFileChooser(new File("c:\\"));
                fc.setFileFilter(new FileNameExtensionFilter("Text File (*.txt)","txt"));
                fc.showOpenDialog(null);

                File file=fc.getSelectedFile();
                String textFile=file.getAbsolutePath();

                try {
                    BufferedReader br=new BufferedReader(new FileReader((textFile)));
                    txtTextArea.read(br,null);
                    br.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        saveFileMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc=new JFileChooser(new File("c:\\"));
                fc.setSelectedFile(new File("Tanpa Judul.txt"));
                fc.setFileFilter(new FileNameExtensionFilter("Text File (*.txt)","txt"));
                fc.showSaveDialog(null);

                File file=fc.getSelectedFile();
                try {
                    String textFile=file.getCanonicalPath();
                    BufferedWriter bw=new BufferedWriter(new FileWriter(textFile));
                    txtTextArea.write(bw);
                    bw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
//                System.out.println("CHOSEN THIS");
                break;
            }
        }

        JFrame frame = new JFrame("PengolahKata");
        frame.setContentPane(new PengolahKata().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setMinimumSize(new Dimension(716, 597));
    }
}
