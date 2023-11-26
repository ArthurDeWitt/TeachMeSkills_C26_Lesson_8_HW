package com.teachmeskills.lesson8.HW;

// Класс com.teachmeskills.lesson8.HW.Therapist, наследник абстрактного класса com.teachmeskills.lesson8.HW.Doctor
public class Therapist extends Doctor {
    public void cure() {
        System.out.println("The therapist treats the patient");
    }

    // Метод, который назначает врача от com.teachmeskills.lesson8.HW.Therapist пациенту согласно плану лечения
    public void assignDoctorToPatient(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            patient.setDoctor(new Surgeon()); // Назначение хирурга
        } else if (patient.getTreatmentPlan() == 2) {
            patient.setDoctor(new Dentist()); // Назначение дантиста
        } else {
            patient.setDoctor(this); // Назначение терапевта
        }
    }
}
