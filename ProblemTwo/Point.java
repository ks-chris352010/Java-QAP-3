package ProblemTwo;

class Point {
    private float xValue; // xValue
    private float yValue; // yValue

    // Constructors:
    public Point(float x, float y) {
        xValue = x; yValue = y;
    }

    public Point() {
        xValue = (float) 0.0; yValue = (float) 0.0;
    }

    // toString method:
    public String toString() {
        return "(" + xValue + ", " + yValue + ")";
    }

    // Getters:
    public float getxValue() {
        return xValue;
    }

    public float getyValue() {
        return yValue;
    }

    public float[] getXY() {
        float[] xy = {xValue, yValue}; return xy;
    }

    // Setters:
    public void setxValue(float xValue) {
        this.xValue = xValue;
    }

    public void setyValue(float yValue) {
        this.yValue = yValue;
    }

    public void setXY(float x, float y) {
        xValue = x; yValue = y;
    }
}