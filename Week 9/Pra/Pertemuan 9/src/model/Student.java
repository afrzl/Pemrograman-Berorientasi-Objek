package model;

public class Student {
    private String nim;
    private String firstName;
    private String lastName;
    private int umur;
    private String asal;

    public String getNim() {
        return nim;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getUmur() {
        return umur;
    }

    public String getAsal() {
        return asal;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }
}
