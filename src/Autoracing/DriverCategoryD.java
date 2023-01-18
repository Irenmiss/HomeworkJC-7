package Autoracing;

public class DriverCategoryD <T extends Transport> extends Driver {
    public DriverCategoryD(String driverFullName, boolean driversLicence, int drivingExperience) {
        super(driverFullName, driversLicence, drivingExperience);
    }
    public DriverCategoryD() {
        super("", true, 0);
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public void driveVehicle(T transport) {
        System.out.println("Водитель " + getDriverFullName() + " управляет автобусом " + transport.getBrand() + " " +
                transport.getModel() + " и будет участвовать в заезде.");
    }
}
