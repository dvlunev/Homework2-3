package animals;

import java.util.Objects;

public class Herbivore extends Mammal {

    private final String typeOfFood; // Логичнее конечно в классе Млекопетающие делать

    public Herbivore(String name,
                     int age,
                     String livingEnvironment,
                     int moveSpeed) {
        super(name, age, livingEnvironment, moveSpeed);
        this.typeOfFood = "растения";
    }

    @Override
    public void walk() {
        System.out.println("Травоядное гуляет по траве");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void pasture() {
        System.out.println("Травоядное пасется");
    }

    @Override
    public void eat() {
        System.out.println("Травоядное питается " + typeOfFood);
    }

    @Override
    public void move() {
        System.out.println("Травоядное ходит по траве");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeOfFood, herbivore.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Животное " + getName() +
                ", класс " + getClass() +
                ", возраст животного " + getAge() +
                ", среда проживания " + getLivingEnvironment() +
                ", скорость перемещения " + getMoveSpeed() +
                ", тип пищи " + typeOfFood;
    }


}
