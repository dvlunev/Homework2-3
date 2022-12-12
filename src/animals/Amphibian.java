package animals;

import java.util.Objects;

public class Amphibian extends Animal {

    private final String livingEnvironment = "вблизи водоемов";

    public Amphibian(String name,
                     int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Земноводное питается рыбой или насекомыми");
    }

    @Override
    public void move() {
        System.out.println("Земноводное плавает или ходит по земле");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunt() {
        System.out.println("Земноводное охотится вблизи водоема");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(livingEnvironment, amphibian.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Животное " + getName() +
                ", класс " + getClass() +
                ", возраст животного " + getAge() +
                ", среда проживания " + getLivingEnvironment();
    }
}
