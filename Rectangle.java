package assignment06;

public class Rectangle extends GraphicObject {

    public Rectangle(double[] referenceValues) {
        super(referenceValues);
    }

    @Override
    protected RuntimeException checkForExceptions(double[] referenceValues) {
        if (referenceValues==null||referenceValues.length!=4){
            return new IllegalArgumentException("argument must have length 4");
        }else if(referenceValues[0]>=referenceValues[2]||referenceValues[1]>=referenceValues[3]) {
            return new IllegalArgumentException("top left, bottom right out of position");
        }else{
            return null;
        }
    }

    @Override
    public void move(double dx, double dy) {
        double[] temp = new double[4];
        temp[0] = this.getReferenceValues()[0]+dx;
        temp[2] = this.getReferenceValues()[2]+dx;
        temp[1] = this.getReferenceValues()[1]+dy;
        temp[3] = this.getReferenceValues()[3]+dy;
        this.setReferenceValues(temp);
    }
}
