package animals;

import java.util.Objects;

public class Predator extends Mammal {

    private final String typeOfFood;

    public Predator(String name,
                    int age,
                    String livingEnvironment,
                    int moveSpeed) {
        super(name, age, livingEnvironment, moveSpeed);
        this.typeOfFood = "другие животные";
    }

    @Override
    public void walk() {
        System.out.println("Хищник ходит по траве в поисках добычи");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void hunt() {
        System.out.println("Хищник охотится");
    }

    @Override
    public void eat() {
        System.out.println("Хищник питается " + typeOfFood);
    }

    @Override
    public void move() {
        System.out.println("Хищник ходит по траве в поисках добычи");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeOfFood, predator.typeOfFood);
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
