public class Reptiles extends Animal {
    
    public Reptiles(String name, int numLegs, String location, String sound) {
        super(name, "Reptiles", numLegs, location, sound);
    }

    @Override
    public String move() {
        return "Slither";
    }
}
