package animals;

import java.util.Objects;

public class Flying extends Bird {

    private final String moveType;

    public Flying(String name,
                  int age,
                  String livingEnvironment) {
        super(name, age, livingEnvironment);
        this.moveType = "летающий";
    }

    @Override
    public void hunt() {
        System.out.println("Летающая птица охотися на земле и в воздухе");
    }

    public String getMoveType() {
        return moveType;
    }

    public void fly() {
        System.out.println("Летающая птица парит в воздухе");
    }

    @Override
    public void eat() {
        System.out.println("Летающая птица ест на земле или в воздухе");
    }

    @Override
    public void move() {
        System.out.println("Летающая птица перемещается по воздуху");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(moveType, flying.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moveType);
    }

    @Override
    public String toString() {
        return "Животное " + getName() +
                ", класс " + getClass() +
                ", возраст животного " + getAge() +
                ", среда проживания " + getLivingEnvironment() +
                ", тип передвижения " + moveType;
    }
}
