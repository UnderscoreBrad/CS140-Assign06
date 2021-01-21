package assignment06;

public class Circle extends GraphicObject{

    public Circle(double[] referenceValues) {
        super(referenceValues);
    }

    @Override
    protected RuntimeException checkForExceptions(double[] referenceValues) {
        if (referenceValues==null||referenceValues.length!=3){
            return new IllegalArgumentException("argument must have length 3");
        }else if(referenceValues[2]<=0) {
            return new IllegalArgumentException("radius must be non-zero");
        }else{
            return null;
        }
    }

    @Override
    public void move(double dx, double dy) {
        double[] temp = new double[3];
        temp[0] = this.getReferenceValues()[0]+dx;
        temp[1] = this.getReferenceValues()[1]+dy;
        temp[2] = this.getReferenceValues()[2];
        this.setReferenceValues(temp);
    }
}
