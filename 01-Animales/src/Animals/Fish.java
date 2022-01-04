package Animals;

public class Fish extends Animal{

    public Fish() {
    }

    public Fish(String name, String weight, String habitat, String riskOfExtinction) {
        super(name, weight, habitat, riskOfExtinction);
    }

    @Override
    public String speak() {
        return "Bubbling (I gess D:)";
    }

    @Override
    public String move() {
        return "Swimming";
    }
}
