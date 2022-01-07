package Animals;

public abstract class Animal {

    private String name;
    private String weight;
    private String habitat;
    private String riskOfExtinction;

    public Animal() {

    }

    public Animal(String name, String weight, String habitat, String riskOfExtinction) {
        this.name = name;
        this.weight = weight;
        this.habitat = habitat;
        this.riskOfExtinction = riskOfExtinction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getRiskOfExtinction() {
        return riskOfExtinction;
    }

    public void setRiskOfExtinction(String riskOfExtinction) {
        this.riskOfExtinction = riskOfExtinction;
    }

    public abstract String speak();
    public abstract String move();
}
