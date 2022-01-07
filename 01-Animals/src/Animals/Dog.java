package Animals;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, String weight, String habitat, String riskOfExtinction) {
        super(name, weight, habitat, riskOfExtinction);
    }

    @Override
    public String speak() {
        return "Barking";
    }

    @Override
    public String move() {
        return "Running";
    }
}
