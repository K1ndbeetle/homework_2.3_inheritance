package Transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     int maxSpeed) {
        if (brand == "" || brand == null || brand == "null") {
            this.brand = "default";
        } else this.brand = brand;
        if (model == "" || model == null || model == "null") {
            this.model = "default";
        } else this.model = model;
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else this.productionYear = productionYear;
        if (productionCountry == "" || productionCountry == null || productionCountry == "null") {
            this.productionCountry = "default";
        } else this.productionCountry = productionCountry;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == "" || color == null || color == "null") {
            this.color = "белый";
        } else this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 200;
        } else this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Транспорт : " +
                "Марка " + brand + ", модель " + model +
                ", цвет " + color + ", год выпуска " + productionYear + ", страна производства "
                + productionCountry + ", максимальная скорость - " + maxSpeed;
    }
}
