package assignment06;

public class Pizza {

    private String description;
    private double cost;

    public Pizza(String description, double cost){
        this.description = description;
        this.cost = cost;
    }

    public String getDescription(){
        return description;
    }

    public double getCost(){
        return cost;
    }
}
