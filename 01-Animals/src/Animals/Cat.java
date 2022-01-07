package Animals;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, String weight, String habitat, String riskOfExtinction) {
        super(name, weight, habitat, riskOfExtinction);
    }

    @Override
    public String speak() {
        return "Meowing";
    }

    @Override
    public String move() {
        return "Walking";
    }
}
