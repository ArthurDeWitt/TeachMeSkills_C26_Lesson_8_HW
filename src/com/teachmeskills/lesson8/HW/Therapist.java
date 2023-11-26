package com.teachmeskills.lesson8.HW;

// Класс Therapist, наследник абстрактного класса Doctor
public class Therapist extends Doctor {
    public void cure() {

        System.out.println("The therapist treats the patient");
    }

    // Метод, который назначает врача от Therapist пациенту согласно плану лечения (curePlan)
    public void assignDoctorToPatient(Patient patient) {
        if (patient.getCurePlan() == 1) {
            patient.setDoctor(new Surgeon()); // Назначение хирурга
        } else if (patient.getCurePlan() == 2) {
            patient.setDoctor(new Dentist()); // Назначение дантиста
        } else {
            patient.setDoctor(this); // Назначение терапевта
        }
    }
}
