package transport;

public class Car extends Transport {
    private final double engineVolume;

    public Car(String brand,
               String model,
               int year,
               String country,
               String color,
               int maxSpeed,
               String fuelType,
               double fuelPercentage,
               double engineVolume) {
        super(brand,model,year,country,color, maxSpeed, fuelType, fuelPercentage);
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;

    }

    @Override
    public void refill() {
        System.out.println("Транспортное средство Автомобиль, заполнено топливом " + getFuelType());
        this.setFuelPercentage(100);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Объем двигателя в литрах " + engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
