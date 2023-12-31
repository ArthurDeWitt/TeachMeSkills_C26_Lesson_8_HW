package com.teachmeskills.lesson8.HW;

// Класс Patient
public class Patient {
    private int curePlan; // Поле curePlan (План лечения)
    private Doctor doctor; // Поле Doctor

    // Конструктор класса Patient
    public Patient(int curePlan) {
        this.curePlan = curePlan;
        this.doctor = null;
    }

    // Метод, который назначает врача пациенту согласно плану лечения (curePlan)
    public void assignDoctor() {
        if (curePlan == 1) {
            doctor = new Surgeon(); // Назначение хирурга (Surgeon)
        } else if (curePlan == 2) {
            doctor = new Dentist(); // Назначение стоматолога (Dentist)
        } else {
            doctor = new Therapist(); // Назначение терапевта (Therapist)
        }
    }

    // Метод, который выполняет лечение пациента (cure) в соответствии с назначенным врачом
    public void receiveCurePlan() {
        if (doctor != null) {
            doctor.cure();
        } else {
            System.out.println("There's no doctor assigned");
        }
    }

    // Геттер для поля curePlan
    public int getCurePlan() {
        return curePlan;
    }

    // Сеттер для поля Doctor
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
