package animals;

import java.util.Objects;

public abstract class Animal {

    private final String name;
    private int age;

    public Animal(String name,
                  int age) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            name = "Животное";
        }
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("Животные закрывают глаза и спят");
    }

    public abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
