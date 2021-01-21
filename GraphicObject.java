package assignment06;

public abstract class GraphicObject {

    private double[] referenceValues;

    protected abstract RuntimeException checkForExceptions(double[] referenceValues);

    public abstract void move(double dx, double dy);

    public GraphicObject(double[] referenceValues){
        if(checkForExceptions(referenceValues)!=null){
            throw checkForExceptions(referenceValues);
        }
        this.referenceValues = referenceValues;
    }

    public double[] getReferenceValues(){
        return referenceValues;
    }

    public void setReferenceValues(double[] referenceValues){
        this.referenceValues = referenceValues;
    }
}
