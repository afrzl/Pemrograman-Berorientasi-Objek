/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mform.form;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mutaqin Alanshoriy
 */
public abstract class Form {

    private List<String> errorMessages = new ArrayList<String>();

    public abstract boolean validate();

    public abstract boolean save();

    public abstract void print();

    public abstract void reset();

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    protected void addErrorMessages(String message) {
        this.errorMessages.add(message);
    }
}
