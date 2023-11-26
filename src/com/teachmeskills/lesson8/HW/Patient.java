package com.teachmeskills.lesson8.HW;

// Класс com.teachmeskills.lesson8.HW.Patient
public class Patient {
    private int curePlan; // Поле curePlan (План лечения)
    private Doctor doctor; // Поле com.teachmeskills.lesson8.HW.Doctor

    // Конструктор класса com.teachmeskills.lesson8.HW.Patient
    public Patient(int curePlan) {
        this.curePlan = curePlan;
        this.doctor = null;
    }

    // Метод, который назначает врача пациенту согласно плану лечения (curePlan)
    public void assignDoctor() {
        if (curePlan == 1) {
            doctor = new Surgeon(); // Назначение хирурга (com.teachmeskills.lesson8.HW.Surgeon)
        } else if (curePlan == 2) {
            doctor = new Dentist(); // Назначение стоматолога (com.teachmeskills.lesson8.HW.Dentist)
        } else {
            doctor = new Therapist(); // Назначение терапевта (com.teachmeskills.lesson8.HW.Therapist)
        }
    }

    // Метод, который выполняет лечение пациента (cure) в соответствии с назначенным врачом
    public void receiveTreatment() {
        if (doctor != null) {
            doctor.cure();
        } else {
            System.out.println("There's no doctor assigned");
        }
    }

    // Геттер для поля curePlan
    public int getTreatmentPlan() {
        return curePlan;
    }

    // Сеттер для поля com.teachmeskills.lesson8.HW.Doctor
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
