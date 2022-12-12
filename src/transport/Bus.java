package transport;

public class Bus extends Transport {

    public Bus(String brand,
               String model,
               int year,
               String country,
               String color,
               int maxSpeed,
               String fuelType,
               double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelType, fuelPercentage);
    }

    @Override
    public void refill() {
        System.out.println("Транспортное средство Автобус, заполнено топливом " + getFuelType());
        this.setFuelPercentage(100);
    }
}
