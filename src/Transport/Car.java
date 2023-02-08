package Transport;

public class Car extends Transport{
    private double engineVolume;
    private String gearbox;
    private final String bodyType;
    private String regNumber;
    private final int cabinCapacity;
    private boolean tireSeason;
    private Key key;

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessEntry;

        public Key(boolean remoteStart, boolean keylessEntry) {
            this.remoteStart = remoteStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return ", удаленный запуск двигателя: " + (remoteStart ? "есть" : "нет") +
                    ", бесключевой доступ: " + (keylessEntry ? "есть" : "нет") + ".";
        }
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               int maxSpeed,
               String gearbox,
               String bodyType,
               String regNumber,
               int cabinCapacity,
               boolean tireSeason,
               Key key) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        setEngineVolume(engineVolume);
        setGearbox(gearbox);
        if (bodyType == "" || bodyType == null || bodyType == "null") {
            this.bodyType = "default";
        } else this.bodyType = bodyType;
        setRegNumber(regNumber);
        if (cabinCapacity <= 0) {
            this.cabinCapacity = 5;
        } else this.cabinCapacity = cabinCapacity;
        this.tireSeason = tireSeason;
        setKey(key);

    }

    public String getBodyType() {
        return bodyType;
    }

    public int getCabinCapacity() {
        return cabinCapacity;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        if (gearbox == "" || gearbox == null || gearbox == "null") {
            this.gearbox = "МКПП";
        } else this.gearbox = gearbox;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == "" || regNumber == null || regNumber == "null") {
            this.regNumber = "X000XX00";
        } else this.regNumber = regNumber;
    }

    public boolean isTireSeason() {
        return tireSeason;
    }

    public void setTireSeason(boolean tireSeason) {
        this.tireSeason = tireSeason;
    }

    public Car.Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null){
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void tireSeason(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            tireSeason = false;
        }
        if (month >= 4 && month <= 10) {
            tireSeason = true;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "объём двигателя - " + engineVolume + " л.с." +
                ", коробка передач " + gearbox + ", тип кузова " + bodyType +
                ", регистрационный номер " + regNumber + ", количество мест " + cabinCapacity + ", " +
                (tireSeason ? "летняя" : "зимняя") + " резина" + key;
    }
}
