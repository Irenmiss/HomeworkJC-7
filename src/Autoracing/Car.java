package Autoracing;

public class Car extends Transport {
    enum BodyType {
        BODY_TYPE_SEDAN("Седан"),
        BODY_TYPE_HATCHBACK("Хэтчбек"),
        BODY_TYPE_COUPE("Купе"),
        BODY_TYPE_STATION_WAGON("Универсал"),
        BODY_TYPE_JEEP("Внедорожник"),
        BODY_TYPE_CROSSOVER("Кроссовер"),
        BODY_TYPE_PICKUP("Пикап"),
        BODY_TYPE_VAN("Фургон"),
        BODY_TYPE_MINIVAN("Минивэн");

        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + bodyType;
        }
    }
    private BodyType bodyType;

    public Car() {
        super("", "", 0);
    }

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
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
        return super.toString() + ", " + bodyType.toString();
    }
}
