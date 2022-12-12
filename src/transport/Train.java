package transport;

public class Train extends Transport {
    private double tripPrice;
    private double tripTime;
    private String departureStation;
    private String arrivalStation;
    private int amountOfWagons;
    protected double fuelPercentage;

    public Train(String brand,
                 String model,
                 int year,
                 String country,
                 String color,
                 int maxSpeed,
                 double tripPrice,
                 double tripTime,
                 String departureStation,
                 String arrivalStation,
                 int amountOfWagons, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed,"дизель", fuelPercentage);
        setTripPrice(tripPrice);
        setTripTime(tripTime);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setAmountOfWagons(amountOfWagons);
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        if (tripPrice <= 0) {
            tripPrice = 60;
        }
        this.tripPrice = tripPrice;
    }

    public double getTripTime() {
        return tripTime;
    }

    public void setTripTime(double tripTime) {
        if (tripTime <= 0)
            tripTime = 5;
        this.tripTime = tripTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation == null ||
                departureStation.isEmpty() ||
                departureStation.isBlank()) {
            departureStation = "Парк начальная";
        }
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        if (arrivalStation == null ||
                arrivalStation.isEmpty() ||
                arrivalStation.isBlank()) {
            arrivalStation = "Парк конечная";
        }
        this.arrivalStation = arrivalStation;
    }

    public int getAmountOfWagons() {
        return amountOfWagons;
    }

    public void setAmountOfWagons(int amountOfWagons) {
        if (amountOfWagons <= 0) {
            amountOfWagons = 5;
        }
        this.amountOfWagons = amountOfWagons;
    }

    @Override
    public void refill() {
        System.out.println("Транспортное средство Поезд, заполнено топливом " + getFuelType());
        this.setFuelPercentage(100);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Цена поездки " + tripPrice +
                ", Время поездки " + tripTime +
                ", Название станции отбытия " + departureStation +
                ", Конечная остановка " + arrivalStation +
                ", Количество вагонов " + amountOfWagons;
    }

    @Override
    public double getFuelPercentage() {
        return fuelPercentage;
    }

    @Override
    public void setFuelPercentage(double fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }
}
