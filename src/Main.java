import Transport.Bus;
import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car carLada = new Car(
                "Lada",
                "",
                1.7,
                "",
                2015,
                "Россия",
                200,
                "МКПП",
                "лифтбэк",
                "А808СА77",
                5,
                false,
                null);

        Car carAudi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                0,
                "Германия",
                220,
                "АКПП",
                "седан",
                "А888АА61",
                5,
                true,
                new Car.Key(true, true));

        Car carBmw = new Car(
                null,
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия",
                260,
                "АКПП",
                "кабриолет",
                "Х888ХХ77",
                5,
                true,
                new Car.Key(false, false));

        Car carKia = new Car(
                "null",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "",
                -180,
                "АКПП",
                "кроссовер",
                "Х404ХХ161",
                5,
                true,
                new Car.Key(true, false));

        Car carHyundai = new Car(
                "Hyundai",
                "Avante",
                0,
                "оранжевый",
                2016,
                "Южная Корея",
                240,
                "",
                "седан",
                "Х761ХХ761",
                5,
                true,
                new Car.Key(false, true));

        System.out.println(carLada + "\n" + carAudi + "\n" +  carBmw  + "\n" +  carKia  + "\n" +  carHyundai);

        carLada.tireSeason(8);
        System.out.println();
        System.out.println(carLada);

        Bus busDaewoo = new Bus(
                "Daewoo",
                "BS 106",
                2011,
                "Корея",
                "белый",
                220
        );

        Bus busHiger = new Bus(
                "Higer",
                "KLQ 6122B",
                2022,
                "Китай",
                "бронза",
                100
        );

        Bus busSetra = new Bus(
                "Setra",
                "S215 HD",
                1983,
                "Германия",
                "серебристый",
                180
        );

        System.out.println();
        System.out.println(busDaewoo + "\n" + busHiger + "\n" +  busSetra);
    }
}
