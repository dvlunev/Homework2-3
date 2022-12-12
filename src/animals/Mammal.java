package animals;

import java.util.Objects;

public abstract class Mammal extends Animal {
    private final String livingEnvironment;
    private final int moveSpeed;

    public Mammal(String name,
                  int age,
                  String livingEnvironment,
                  int moveSpeed) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            livingEnvironment = "суша";
        }
        this.livingEnvironment = livingEnvironment;
        if (moveSpeed <= 0) {
            moveSpeed = 5;
        }
        this.moveSpeed = moveSpeed;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public abstract void walk();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return moveSpeed == mammal.moveSpeed && Objects.equals(livingEnvironment, mammal.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, moveSpeed);
    }
}
