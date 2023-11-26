package com.teachmeskills.lesson8.HW;

// Класс-раннер для запуска

public class ClinicSimulation {
    public static void main(String[] args) {

        // Создание объекта класса Patient с планом лечения 1
        Patient patient1 = new Patient(1);
        patient1.assignDoctor();
        patient1.receiveCurePlan();


        // Создание объекта класса Patient с планом лечения 2
        Patient patient2 = new Patient(2);
        patient2.assignDoctor();
        patient2.receiveCurePlan();

        // Создание объекта класса Patient с планом лечения 3
        Patient patient3 = new Patient(3);
        patient3.assignDoctor();
        patient3.receiveCurePlan();
    }
}
