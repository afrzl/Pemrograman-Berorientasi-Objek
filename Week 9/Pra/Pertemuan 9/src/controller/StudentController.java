package controller;

import com.sun.source.tree.ThrowTree;
import model.Student;
import view.StudentView;
import view.StudentForm;
import java.util.*;

public class StudentController {
    private ArrayList<Student> model = new ArrayList<>();
    private StudentView view;

    public StudentController() {}

    public StudentController(ArrayList <Student> model, StudentView view) {
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
        view.print(student);
    }

    public String updateAllView() {
        view = new StudentView();
        String res = "Daftar NIM dan Nama Mahasiswa yang telah berhasil disimpan : \n";
        for(Student std : this.model) {
            res += view.print(std) + '\n';
        }

        return res;
    }

    public void validateForm(String nim, String firstName, String lastName, String umur, String asal) {
        String err = "";
        if (nim.isBlank() || firstName.isBlank() || lastName.isBlank() || asal.isBlank()) {
            err += "Terjadi kesalahan input pada: form isian wajib diisi semua.\n";
        } else {
            if (nim.length() != 6) {
                err += "Terjadi kesalahan input pada: NIM harus memiliki panjang 6 digit.\n";
            }
            String name = firstName + lastName;
            if (name.length() > 50) {
                err += "Terjadi kesalahan input pada: Nama depan + nama belakang tidak boleh lebih dari 50 karakter.\n";
            }
            if (!umur.matches("\\d+")) {
                err += "Terjadi kesalahan input pada: Umur hanya dapat diisi dengan angka.\n";
            }
        }

        if (err != "") {
            throw new IllegalArgumentException(err);
        }
    }
}
