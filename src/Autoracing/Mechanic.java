package Autoracing;

import java.util.Objects;

public class Mechanic {
    final private String mechanicFullName;
    private String mechanicEmployerCompany;
    public enum MechanicSpecializations {
        SPECIALIZATION_CAR("Ремонт легковых автомобилей"),
        SPECIALIZATION_TRUCK("Ремонт грузовых автомобилей"),
        SPECIALIZATION_BUS("Ремонт автобусов"),
        SPECIALIZATION_UNIVERSAL("Ремонт всех типов транспорта");
        private final String mechanicSpecialization;

        MechanicSpecializations(String mechanicSpecialization) {
            this.mechanicSpecialization = mechanicSpecialization;
        }

        public String getMechanicSpecialization() {
            return mechanicSpecialization;
        }

        @Override
        public String toString() {
            return getMechanicSpecialization();
        }
    }
    private MechanicSpecializations mechanicSpecialization;
    public Mechanic(String mechanicFullName, String mechanicEmployerCompany, MechanicSpecializations mechanicSpecialization) {
        this.mechanicFullName = mechanicFullName;
        this.mechanicEmployerCompany = mechanicEmployerCompany;
        this.mechanicSpecialization = mechanicSpecialization;
    }
    public String getMechanicFullName() {
        return mechanicFullName;
    }

    public String getMechanicEmployerCompany() {
        return mechanicEmployerCompany;
    }

    public void setMechanicEmployerCompany(String mechanicEmployerCompany) {
        if (mechanicEmployerCompany == null || mechanicEmployerCompany.isBlank() || mechanicEmployerCompany.isEmpty()) {
            this.mechanicEmployerCompany = "Работодатель не указан";
        } else {
            this.mechanicEmployerCompany = mechanicEmployerCompany;
        }
    }
    public MechanicSpecializations getMechanicSpecialization() {
        return mechanicSpecialization;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(mechanicFullName, mechanic.mechanicFullName) && Objects.equals(mechanicEmployerCompany, mechanic.mechanicEmployerCompany) && Objects.equals(mechanicSpecialization, mechanic.mechanicSpecialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanicFullName, mechanicEmployerCompany, mechanicSpecialization);
    }

    @Override
    public String toString() {
        return "ФИО механика: " + getMechanicFullName() + ", специализация: " + getMechanicSpecialization() + ", место работы: " + getMechanicEmployerCompany() + ".";
    }
    public void doMaintenance() {
        System.out.println("Механик " + getMechanicFullName() + " из компании " + getMechanicEmployerCompany() + " проводит техобслуживание.");
    }
}
