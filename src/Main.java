import animals.*;
import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {

        // Задание 1-1
        System.out.println("Задание 1-1");
        Car ladaGranta = new Car(
                "",
                null,
                2015,
                "Россия",
                "желтый",
                60,
                "бензин",
                30.5,
                1.6
        );
        Car audiA8 = new Car(
                "Audi",
                "",
                2020,
                null,
                "черный",
                300,
                "бензин",
                45.56,
                2.5
        );
        Car bmwZ8 = new Car(
                "BMW",
                "Z8",
                2021,
                "Германия",
                " ",
                -5,
                "дизель",
                67.12,
                3.0
        );
        Car kiaSportage = new Car(
                "Kia",
                "Sportage 4-го поколения",
                0,
                "Южная Кореия",
                "красный",
                220,
                "бензин",
                -7,
                0
        );
        Car hyundaiAvante = new Car(
                "Hyundai",
                "Avante",
                -2022,
                "Южная Корея",
                "оранжевый",
                -78,
                "бензин",
                98.34,
                0
        );
        ladaGranta.setMaxSpeed(-10000000);
        audiA8.setMaxSpeed(250);
        bmwZ8.setMaxSpeed(260);
        kiaSportage.setMaxSpeed(0);
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
        System.out.println();

        // Задание 1-2
        System.out.println("Задание 1-2");

        Train martin = new Train(
                "Ласточка",
                "B-901",
                2011,
                "Россия",
                null,
                301,
                3500,
                24,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11,
                -5);
        Train leningrad = new Train(
                "Ленинград",
                "D-125",
                2019,
                "Россия",
                null,
                270,
                1700,
                13.5,
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8,
                0);

        System.out.println(martin);
        System.out.println(leningrad);
        System.out.println();

        // Задание 1-3
        System.out.println("Задание 1-3");
        Bus cityBus = new Bus(
                "",
                "5292",
                2022,
                "Россия",
                "голубой",
                110,
                null,
                98.45
        );
        Bus shuttleBus = new Bus(
                "МАЗ",
                "   ",
                2021,
                "Белоруссия",
                "зеленый",
                -5,
                " ",
                -75
        );
        Bus intercityBus = new Bus(
                "Scania",
                "A80 4x2",
                0,
                "",
                null,
                -5,
                null,
                78.65
        );
        System.out.println(cityBus);
        System.out.println(shuttleBus);
        System.out.println(intercityBus);
        System.out.println();

        // Задание 2-1
        System.out.println("Задание 2-1");
        kiaSportage.refill();
        System.out.println(kiaSportage);
        martin.refill();
        System.out.println(martin);
        intercityBus.refill();
        System.out.println(intercityBus);
        System.out.println();

        // Задание 3-1
        System.out.println("Задание 3-1");
        Herbivore gazelle = new Herbivore(
                "Газель",
                -1,
                "пустыня",
                80
        );
        Herbivore giraffe = new Herbivore(
                "Жираф",
                0,
                "саванна",
                60
        );
        Herbivore horse = new Herbivore(
                "Лошадь",
                3,
                "степь",
                88
        );
        Herbivore horse2 = new Herbivore(
                "Лошадь",
                3,
                "степь",
                88
        );
        Predator hyena = new Predator(
                "Гиена",
                4,
                "",
                64
        );
        Predator tiger = new Predator(
                "Тигр",
                5,
                null,
                60
        );
        Predator bear = new Predator(
                "Медведь",
                6,
                "лес",
                56
        );
        Amphibian frog = new Amphibian(
                "Лягушка",
                7
        );
        Amphibian adderFreshWater = new Amphibian(
                "Уж пресноводный",
                8
        );
        Flightless peacock = new Flightless(
                "Павлин",
                9,
                "джунгли"
        );
        Flightless penguin = new Flightless(
                "Пингвин",
                10,
                "Антарктида и прибрежные воды"
        );
        Flightless dodoBird = new Flightless(
                "Птица додо",
                11,
                "   "
        );
        Flying seaGull = new Flying(
                "Чайка",
                12,
                "море или водоемы"
        );
        Flying albatross = new Flying(
                "Альбатрос",
                12,
                "море"
        );
        Flying hawk = new Flying(
                "Сокол",
                13,
                "пустыня"
        );

        animalComparison(albatross,hawk);
        animalComparison(horse,horse2);

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(horse2);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(adderFreshWater);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        System.out.println(seaGull);
        System.out.println(albatross);
        System.out.println(hawk);
    }

    public static void animalComparison(Animal animal1, Animal animal2) {
        if (animal1.equals(animal2)) {
            System.out.println("Животные " + animal1.getName() + " и " + animal2.getName() + " одинаковые");
        } else {
            System.out.println("Животные " + animal1.getName() + " и " + animal2.getName() + " разные");
        }
    }
}