package Autoracing;

public class Truck extends Transport {
    enum LoadCapacity {
        N1(0f, 3.5f),
        N2(3.5f, 12f),
        N3(12.1f, 0);
        private final float minimumTonnage;
        private final float maximumTonnage;
        LoadCapacity(float minimumTonnage, float maximumTonnage) {
            this.minimumTonnage = minimumTonnage;
            this.maximumTonnage = maximumTonnage;
        }
        public String toString() {
            if (minimumTonnage == 0) {
                return "Грузоподъемность: до " + maximumTonnage + " тонн.";
            }
            if (maximumTonnage == 0) {
                return "Грузоподъемность: свыше " + minimumTonnage + " тонн.";
            }
            return "Грузоподъемность: от " + minimumTonnage + " до " + maximumTonnage + " тонн.";
        }

        public Float getMinimumTonnage() {
            return minimumTonnage;
        }

        public Float getMaximumTonnage() {
            return maximumTonnage;
        }
    }
    private LoadCapacity loadCapacity;
    public Truck() {
        super("", "", 0);
    }

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + ", " + loadCapacity.toString();
    }
}
