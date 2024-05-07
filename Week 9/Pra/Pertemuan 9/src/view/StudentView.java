package view;

import model.Student;

public class StudentView {
    public StudentView() {}

    public String print(Student student) {
        return student.getNim() + "-" + student.getFirstName() + " " + student.getLastName();
    }
}
