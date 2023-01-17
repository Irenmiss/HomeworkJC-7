package Autoracing;

import java.util.Objects;

public class Bus extends Transport {
    enum NumberOfSeats {
        SUPER_SMALL(0, 10),
        SMALL(0, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        SUPER_LARGE(100, 120);
        private final int minimumNumberOfSeats;
        private final int maximumNumberOfSeats;

        NumberOfSeats(Integer minimumNumberOfSeats, Integer maximumNumberOfSeats) {
            this.minimumNumberOfSeats = minimumNumberOfSeats;
            this.maximumNumberOfSeats = maximumNumberOfSeats;
        }

        public Integer getMinimumNumberOfSeats() {
            return minimumNumberOfSeats;
        }

        public Integer getMaximumNumberOfSeats() {
            return maximumNumberOfSeats;
        }
        public String toString() {
            if (minimumNumberOfSeats == 0) {
                return "Вместимость: до " + maximumNumberOfSeats + " мест.";
            }
            if (maximumNumberOfSeats == 0) {
                return "Вместимость: более " + minimumNumberOfSeats + " мест.";
            }
            return "Вместимость: " + minimumNumberOfSeats + "-" + maximumNumberOfSeats + " мест.";
        }

    }
    private NumberOfSeats numberOfSeats;
    public Bus() {
        super("", "", 0);
    }

    public Bus(String brand, String model, double engineVolume, NumberOfSeats numberOfSeats) {
        super(brand, model, engineVolume);
        this.numberOfSeats = numberOfSeats;
    }
    @Override
    public String toString() {
        return super.toString() + ", " + numberOfSeats.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return numberOfSeats == bus.numberOfSeats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSeats);
    }
}
