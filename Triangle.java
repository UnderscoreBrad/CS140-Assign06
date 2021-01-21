package assignment06;

public class Triangle extends GraphicObject {

    public Triangle(double[] referenceValues) {
        super(referenceValues);
    }

    @Override
    protected RuntimeException checkForExceptions(double[] pts) {
        if (pts==null||pts.length!=6){
            return new IllegalArgumentException("argument must have length 6");
        }else if(pts[0]*pts[3] + pts[2]*pts[5] + pts[4]*pts[1] - pts[1]*pts[2] - pts[3]*pts[4] - pts[5]*pts[0] == 0) {
            return new IllegalArgumentException("points must give non-zero area");
        }else{
            return null;
        }
    }

    @Override
    public void move(double dx, double dy) {
        double[] temp = new double[6];
        temp[0] = this.getReferenceValues()[0]+dx;
        temp[2] = this.getReferenceValues()[2]+dx;
        temp[4] = this.getReferenceValues()[4]+dx;
        temp[1] = this.getReferenceValues()[1]+dy;
        temp[3] = this.getReferenceValues()[3]+dy;
        temp[5] = this.getReferenceValues()[5]+dy;
        this.setReferenceValues(temp);
    }
}
