package com.hospital;

import java.util.Stack;

/**
 * @author :
 */
public class PatientFile extends Patient {
    Patient patient = new Patient();
    int FileNumber = 0;
    Stack<Appointment> ArrayOfAppointment = new Stack<Appointment>();

    /**
     * Constructor
     * @param p: patient object
     */
    PatientFile(Patient p){
        patient = p;
    }
}
