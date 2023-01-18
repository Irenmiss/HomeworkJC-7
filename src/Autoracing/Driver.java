package Autoracing;

import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private String driverFullName;
    private boolean driversLicence;
    private int drivingExperience;

    public Driver(String driverFullName, boolean driversLicence, int drivingExperience) {
        if (driverFullName == null || driverFullName.isEmpty()) {
            this.driverFullName = "No Name";
        } else {
            this.driverFullName = driverFullName;
        }
        this.driversLicence = driversLicence;
        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }
    public String getDriverFullName() {
        return driverFullName;
    }

    public void setDriverFullName(String driverFullName) {
        if (driverFullName == null || driverFullName.isEmpty()) {
            this.driverFullName = "ФИО не указано";
        } else {
            this.driverFullName = driverFullName;
        }
    }

    public boolean isDriversLicence() {
        return driversLicence;
    }

    public void setDriversLicence(boolean driversLicence) {
        this.driversLicence = driversLicence;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }

    @Override
    public String toString() {
        return "Имя водителя: " + driverFullName + ". Наличие водительских прав: " + driversLicence +
                ". Стаж вождения: " + drivingExperience + " лет.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driversLicence == driver.driversLicence && drivingExperience == driver.drivingExperience && Objects.equals(driverFullName, driver.driverFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverFullName, driversLicence, drivingExperience);
    }
}
