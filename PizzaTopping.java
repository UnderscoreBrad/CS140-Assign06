package assignment06;

public abstract class PizzaTopping extends Pizza{

    private Pizza on;

    public PizzaTopping(String description, double cost, Pizza pizza) {
        super(description, cost);
        on = pizza;
    }

    @Override
    public double getCost(){
        return super.getCost() + on.getCost();
    }

    @Override
    public String getDescription(){
        String rtn = super.getDescription();
        if(on instanceof PizzaTopping){
            rtn += ", " + on.getDescription();
        }else{
            rtn += " on " + on.getDescription();
        }
        return rtn;
    }

    public Pizza getOn(){
        return on;
    }

    public void setOn(Pizza on){
        this.on = on;
    }
}
