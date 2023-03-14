public class Birds extends Animal {
    public Birds(String name, String location, String sound) {
        super(name, "Birds", 2, location, sound);
    }

    @Override
    public String move() {
        return "Fly";
    }
}
