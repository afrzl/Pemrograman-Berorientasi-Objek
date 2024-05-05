/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mform;

import java.util.List;
import mform.form.StudentForm;
import mform.entity.Student;

/**
 *
 * @author user
 */
public class MForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentForm form = new StudentForm();
        Student student = new Student();
        student.setName("Muhammad Sa'ad");
        student.setGender("Male");
        student.setEmail("saad@mail.id");
        form.setStudent(student);
        if(!form.validate()){
            System.out.println("Data invalid. Fix errors below:");
            List<String> errorMessages = form.getErrorMessages();
            for (String errorMessage : errorMessages) {
                System.out.println("- "+ errorMessage);
            }
        }else{
            System.out.println("Save data");
            form.save();
            System.out.println("Data saved!");
            System.out.println("Print data");
            form.print();
            form.reset();
            form.print();
        }
    }
}