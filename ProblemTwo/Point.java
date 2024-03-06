package ProblemTwo;

class Point {
    private float xValue;
    private float yValue;

    public Point(float x, float y) {
        xValue = x; yValue = y;
    }
    public Point() {
        xValue = (float) 0.0; yValue = (float) 0.0;
    }

    public float getxValue() {
        return xValue;
    }

    public float getyValue() {
        return yValue;
    }

    public void setxValue(float xValue) {
        this.xValue = xValue;
    }

    public void setyValue(float yValue) {
        this.yValue = yValue;
    }

    public void setXY(float x, float y) {
        xValue = x; yValue = y;
    }

    public float[] getXY() {
        float[] xy = {xValue, yValue}; return xy;
    }

    public String toString() {
        return "(" + xValue + ", " + yValue + ")";
    }
}