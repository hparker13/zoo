public class Mammals extends Animal {
    public Mammals(String name, String location, String sound) {
        super(name, "Mammals", 4, location, sound);
    }

    @Override
    public String move() {
        return "Walk";
    }
}
