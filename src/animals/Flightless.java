package animals;

import java.util.Objects;

public class Flightless extends Bird {

    private final String moveType;

    public Flightless(String name,
                      int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
        this.moveType = "нелетающий";
    }

    @Override
    public void hunt() {
        System.out.println("Нелетающая птица охотися на земле");
    }

    public String getMoveType() {
        return moveType;
    }

    public void walk() {
        System.out.println("Нелетающая гуляет по земле");
    }

    @Override
    public void eat() {
        System.out.println("Нелетающая птица ест стоя");
    }

    @Override
    public void move() {
        System.out.println("Нелетающая птица ходит по земле");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(moveType, that.moveType);
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
