/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Student;
import view.StudentView;
import java.util.*;

/**
 *
 * @author muham
 */
public class StudentController {
    private List<Student> model;
    private StudentView view;
    
    public StudentController(List <Student> model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    public void addStudent(Student student) {
        model.add(student);
    }
    
    public void removeStudent(Student student) {
        model.remove(student);
    }
    
    public void setStudentNim(Student student, String nim) {
        for(Student mdl : this.model) {
            if(mdl == student) {
                mdl.setNim(nim);
            }
        }
    }
    
    public String getStudentNim(Student student) {
        for (Student std : this.model) {
            if(std == student) {
                return std.getNim();
            }
        }
        return "No data.";
    }
    
    public void setStudentFirstName(Student student, String firstName) {
        for(Student mdl : this.model) {
            if(mdl == student) {
                mdl.setFirstName(firstName);
            }
        }
    }
    
    public String getStudentFirstName(Student student) {
        for (Student std : this.model) {
            if(std == student) {
                return std.getFirstName();
            }
        }
        return "No data.";
    }
    
    public void setStudentLastName(Student student, String lastName) {
        for(Student mdl : this.model) {
            if(mdl == student) {
                mdl.setLastName(lastName);
            }
        }
    }
    
    public String getStudentLastName(Student student) {
        for (Student std : this.model) {
            if(std == student) {
                return std.getLastName();
            }
        }
        return "No data.";
    }
    
    public void setStudentUmur(Student student, int umur) {
        for(Student mdl : this.model) {
            if(mdl == student) {
                mdl.setUmur(umur);
            }
        }
    }
    
    public int getStudentUmur(Student student) {
        for (Student std : this.model) {
            if(std == student) {
                return std.getUmur();
            }
        }
        return 0;
    }
    
    public void setStudentAsal(Student student, String asal) {
        for(Student mdl : this.model) {
            if(mdl == student) {
                mdl.setAsal(asal);
            }
        }
    }
    
    public String getStudentAsal(Student student) {
        for (Student std : this.model) {
            if(std == student) {
                return std.getAsal();
            }
        }
        return "No data.";
    }
    
    public void updateView(Student student) {
        view.print(student.getNim(), student.getFirstName(), student.getLastName());
    }
    
    public void updateAllView() {
        for(Student std : this.model) {
            view.print(std.getNim(), std.getFirstName(), std.getLastName());
        }
    }
    
}
