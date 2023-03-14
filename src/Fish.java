public class Fish extends Animal {
    public Fish(String name, String location) {
        super(name, "Fish", 0, location, "Blup blup");
    }

    @Override
    public String move() {
        return "Swim";
    }
}
