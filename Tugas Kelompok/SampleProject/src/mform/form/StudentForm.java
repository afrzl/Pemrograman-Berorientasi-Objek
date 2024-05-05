/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mform.form;

import mform.entity.Student;

/**
 *
 * @author Mutaqin Alanshoriy
 */
public class StudentForm extends Form {

    private Student student;

    public StudentForm() {
    }

    public StudentForm(Student student) {
        this.student = student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public boolean validate() {
        if (student.getName().length() > 16) {
            super.addErrorMessages("Invalid name: more than 16 characters.");
        }
        if (!(student.getGender().equals("Male") || student.getGender().equals("Female"))) {
            super.addErrorMessages("Invalid gender");
        }
        if (!(student.getEmail().contains("@") && student.getEmail().contains("."))) {
            super.addErrorMessages("Invalid email format");
        }
        return super.getErrorMessages().isEmpty();
    }

    @Override
    public boolean save() {
        System.out.println("Save here...");
        return true;
    }

    @Override
    public void reset() {
        student.setEmail("");
        student.setName("");
        student.setGender("");
    }

    @Override
    public void print() {
        System.out.println("Name: "+student.getName());
        System.out.println("Gender: "+student.getGender());
        System.out.println("Email: "+student.getEmail());
    }
}
