package Animals;

public class Cow extends Animal{

    public Cow() {
    }

    public Cow(String name, String weight, String habitat, String riskOfExtinction) {
        super(name, weight, habitat, riskOfExtinction);
    }

    @Override
    public String speak() {
        return "Mooing";
    }

    @Override
    public String move() {
        return "Walking";
    }
}
