package animals;

import java.util.Objects;

public abstract class Bird extends Animal {

    private final String livingEnvironment;

    public Bird(String name,
                int age,
                String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            livingEnvironment = "суша";
        }
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public abstract void hunt();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(livingEnvironment, bird.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
