package Animals;

public class Bird extends Animal{

    public Bird() {
    }

    public Bird(String name, String weight, String habitat, String riskOfExtinction) {
        super(name, weight, habitat, riskOfExtinction);
    }

    @Override
    public String speak() {
        return "Chirping";
    }

    @Override
    public String move() {
        return "Flying";
    }
}
