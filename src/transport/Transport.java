package transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;
    private final String fuelType;
    protected double fuelPercentage;

    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color,
                     int maxSpeed,
                     String fuelType,
                     double fuelPercentage
    ) {
        if (StringUtils.isNullOrEmptyOrBlank(brand)) {
            brand = "default";
        }
        this.brand = brand;
        if (StringUtils.isNullOrEmptyOrBlank(model)) {
            model = "default";
        }
        this.model = model;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (StringUtils.isNullOrEmptyOrBlank(country)) {
            country = "default";
        }
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
        if (StringUtils.isNullOrEmptyOrBlank(fuelType)) {
            fuelType = "дизель";
        }
        this.fuelType = fuelType;
        setFuelPercentage(fuelPercentage);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (StringUtils.isNullOrEmptyOrBlank(color)) {
            color = "белый";
        }
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        }
        this.maxSpeed = maxSpeed;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public String getFuelType() {
        return fuelType;
    }

    protected void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage < 0 ||
                fuelPercentage > 100) {
            fuelPercentage = 10.00;
        }
        this.fuelPercentage = fuelPercentage;
    }

    public abstract void refill();

    @Override
    public String toString() {
        return "Транспорт: Марка " + getBrand() +
                ", Модель " + getModel() +
                ", Цвет кузова " + getColor() +
                ", Год производства " + getYear() +
                ", Страна сборки " + getCountry() +
                ", Максимальная скорость " + getMaxSpeed() +
                ", Количество топлива в процентах " + getFuelPercentage() + "%";
    }
}