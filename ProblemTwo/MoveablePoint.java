package ProblemTwo;

class MoveablePoint extends Point {
    private float xSpeedVal; // xSpeed value
    private float ySpeedVal; // ySpeed value

    // Constructors:
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); xSpeedVal = xSpeed; ySpeedVal = ySpeed;
    }

    public MoveablePoint() {
        super((float) 0.0, (float) 0.0); xSpeedVal = (float) 0.0; ySpeedVal = (float) 0.0;
    }

    // toString method:
    public String toString() {
        return "(" + getxValue() + ", " + getyValue() + "), speed: (" + xSpeedVal + ", " + ySpeedVal + ")";
    }

    // Getters:
    public float getxSpeedVal() {
        return xSpeedVal;
    }

    public float getySpeedVal() {
        return ySpeedVal;
    }

    public float[] getXY() {
        float[] xy = {xSpeedVal, ySpeedVal}; return xy;
    }

    // Setters:
    public void setxSpeedVal(float xSpeedVal) {
        this.xSpeedVal = xSpeedVal;
    }

    public void setySpeedVal(float ySpeedVal) {
        this.ySpeedVal = ySpeedVal;
    }

    public void setXY(float x, float y) {
        xSpeedVal = x; ySpeedVal = y;
    }

    // Move method:
    public MoveablePoint move() {
        // Increments by speed values:
        setxValue(getxValue()+xSpeedVal); 
        setyValue(getyValue()+ySpeedVal);
        return this;
    }
}
