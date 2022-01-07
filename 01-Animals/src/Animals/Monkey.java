package Animals;

public class Monkey extends Animal{

    public Monkey() {
    }

    public Monkey(String name, String weight, String habitat, String riskOfExtinction) {
        super(name, weight, habitat, riskOfExtinction);
    }

    @Override
    public String speak() {
        return "Screaming";
    }

    @Override
    public String move() {
        return "Jumping";
    }
}
