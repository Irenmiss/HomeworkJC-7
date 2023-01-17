package Autoracing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Transport> transports = new ArrayList<>();
        Car car1 = new Car("Лада Калина", "", 1.5, Car.BodyType.BODY_TYPE_HATCHBACK);
        Car car2 = new Car("Audi A8", "50 L TDI quattro", 3, Car.BodyType.BODY_TYPE_SEDAN);
        Car car3 = new Car("BMW", "Z8", 3, Car.BodyType.BODY_TYPE_CROSSOVER);
        Car car4 = new Car("Kia", "Sportage", 2.4, Car.BodyType.BODY_TYPE_SEDAN);
        Bus bus1 = new Bus("ЛиАЗ", "21", 5, Bus.NumberOfSeats.SMALL);
        Bus bus2 = new Bus("Мерседес", "233", 5, Bus.NumberOfSeats.SUPER_SMALL);
        Bus bus3 = new Bus("ПАЗ", "258", 5, Bus.NumberOfSeats.LARGE);
        Bus bus4 = new Bus("КАВЗ", "77", 5, Bus.NumberOfSeats.MEDIUM);
        Truck truck1 = new Truck("КамАЗ", "33", 6, Truck.LoadCapacity.N1);
        Truck truck2 = new Truck("JAC", "22", 7, Truck.LoadCapacity.N3);
        Truck truck3 = new Truck("Komatsu", "355", 6, Truck.LoadCapacity.N2);
        Truck truck4 = new Truck("Scania", "66", 7, Truck.LoadCapacity.N1);
        transports.add(car1);
        transports.add(car2);
        transports.add(car3);
        transports.add(car4);
        transports.add(bus1);
        transports.add(bus2);
        transports.add(bus3);
        transports.add(bus4);
        transports.add(truck1);
        transports.add(truck2);
        transports.add(truck3);
        transports.add(truck4);
        transports.forEach(System.out::println);

//        List<Driver> drivers = new ArrayList<>();
//        DriverCategoryB<Car> driver1 = new DriverCategoryB<Car>("Иванов И.И.", true, 10);
//        DriverCategoryC<Truck> driver2 = new DriverCategoryC<Truck>("Петров П.П.", true, 15);
//        DriverCategoryD<Bus> driver3 = new DriverCategoryD<Bus>("Сидоров С.С.", true, 5);
//        drivers.add(driver1);
//        drivers.add(driver2);
//        drivers.add(driver3);
//        drivers.forEach(System.out::println);
//
//        driver1.driveVehicle(car1);
//        driver2.driveVehicle(truck2);
//        driver3.driveVehicle(bus2);

        List<Mechanic> mechanics = new ArrayList<>();
        Mechanic mechanic1 = new Mechanic("Винтик В.В.", "Авто-Сервис", Mechanic.MechanicSpecializations.SPECIALIZATION_CAR);
        Mechanic mechanic2 = new Mechanic("Шпунтик Ш.Ш.", "Авто-Сервис", Mechanic.MechanicSpecializations.SPECIALIZATION_BUS);
        Mechanic mechanic3 = new Mechanic("Ломастер Н.Н", "Супер-Ремонт", Mechanic.MechanicSpecializations.SPECIALIZATION_TRUCK);
        Mechanic mechanic4 = new Mechanic("Всёумейкин К.К.", "Техпомощь", Mechanic.MechanicSpecializations.SPECIALIZATION_UNIVERSAL);
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);
        mechanics.add(mechanic4);
        mechanics.forEach(System.out::println);

        car1.defineMechanicForTransport(mechanic1);
        car2.defineMechanicForTransport(mechanic1);
        car3.defineMechanicForTransport(mechanic1);
        car4.defineMechanicForTransport(mechanic4);
        truck1.defineMechanicForTransport(mechanic3);
        truck2.defineMechanicForTransport(mechanic3);
        truck3.defineMechanicForTransport(mechanic3);
        truck4.defineMechanicForTransport(mechanic4);
        bus1.defineMechanicForTransport(mechanic2);
        bus2.defineMechanicForTransport(mechanic2);
        bus3.defineMechanicForTransport(mechanic2);
        bus4.defineMechanicForTransport(mechanic4);

//        Map<Transport, Mechanic> transportMechanicMap = new HashMap<>();
//        transportMechanicMap.put(car1, mechanic1);
//        transportMechanicMap.put(car2, mechanic1);
//        transportMechanicMap.put(car3, mechanic1);
//        transportMechanicMap.put(car4, mechanic4);
//        transportMechanicMap.put(bus1, mechanic2);
//        transportMechanicMap.put(bus2, mechanic2);
//        transportMechanicMap.put(bus3, mechanic4);
//        transportMechanicMap.put(bus4, mechanic2);
//        transportMechanicMap.put(truck1, mechanic4);
//        transportMechanicMap.put(truck2, mechanic3);
//        transportMechanicMap.put(truck3, mechanic3);
//        transportMechanicMap.put(truck4, mechanic3);
//        transportMechanicMap.put(truck2, mechanic3);
//        transportMechanicMap.put(truck2, mechanic3);
//        for (Map.Entry<Transport, Mechanic> map : transportMechanicMap.entrySet()) {
//            System.out.println(map.getKey() + " : " + map.getValue());
//        }

//        System.out.println(car4.getMechanics());

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addTransportToQueue(car1);
        serviceStation.addTransportToQueue(bus3);
        serviceStation.addTransportToQueue(truck4);
        serviceStation.addTransportToQueue(car3);
        serviceStation.addTransportToQueue(truck2);
        serviceStation.addTransportToQueue(car4);
        serviceStation.doMaintenance();


    }
}
