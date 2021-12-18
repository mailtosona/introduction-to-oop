public class Parrot extends Bird {
    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " Parrot.");
    }

    @Override
    public void fly() {
        System.out.println("Kuu Kuu, I can fly.");
    }
}
