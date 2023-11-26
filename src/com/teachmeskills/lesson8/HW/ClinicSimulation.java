package com.teachmeskills.lesson8.HW;

// Класс-раннер для запуска

public class ClinicSimulation {
    public static void main(String[] args) {

        // Создание объекта класса com.teachmeskills.lesson8.HW.Patient с планом лечения 1
        Patient patient1 = new Patient(1);
        patient1.assignDoctor();
        patient1.receiveTreatment();

        // Создание объекта класса com.teachmeskills.lesson8.HW.Patient с планом лечения 2
        Patient patient2 = new Patient(2);
        patient2.assignDoctor();
        patient2.receiveTreatment();

        // Создание объекта класса com.teachmeskills.lesson8.HW.Patient с другим планом лечения
        Patient patient3 = new Patient(3);
        patient3.assignDoctor();
        patient3.receiveTreatment();
    }
}
