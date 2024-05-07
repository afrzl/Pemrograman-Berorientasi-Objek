package view;

import controller.StudentController;
import model.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm {
    private JPanel panelMain;
    private JTextField nim;
    private JTextField lastName;
    private JTextField firstName;
    private JSpinner umur;
    private JComboBox asal;
    private JButton reset;
    private JButton simpan;
    private static StudentController studentController;
    private StudentView studentView;

    public StudentForm() {
        simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student student = new Student();
                String nimField = nim.getText();
                String firstNameField = firstName.getText();
                String lastNameField = lastName.getText();
                String umurField = umur.getValue().toString();
                String asalField = String.valueOf(asal.getSelectedItem());

                try {
                    studentController.validateForm(nimField, firstNameField, lastNameField, umurField, asalField);

                    student.setNim(nimField);
                    student.setFirstName(firstNameField);
                    student.setLastName(lastNameField);
                    student.setUmur(Integer.parseInt(umurField));
                    student.setAsal(asalField);

                    studentController.addStudent(student);
                    JOptionPane.showMessageDialog(panelMain, studentController.updateAllView());
                    reset.doClick();

                } catch (IllegalArgumentException err) {
                    JOptionPane.showMessageDialog(panelMain, err.getMessage());
                }
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nim.setText("");
                firstName.setText("");
                lastName.setText("");
                umur.setValue(0);
                asal.setSelectedIndex(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentForm");
        frame.setContentPane(new StudentForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        studentController = new StudentController();
    }
}

