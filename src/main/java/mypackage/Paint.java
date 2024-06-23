package mypackage;

public class Paint {
    double v;
    int r;
    int y;
    int b;
    Paint(double v, int r, int y, int b) {
        this.v = v;
        this.r = r;
        this.y = y;
        this.b = b;
    }
    public void paint(Paint paint) {
        v = v + paint.getV();
    }
    public double getV() {
        return v;
    }
    public int getR() {
        return r;
    }
    public int getY() {
        return y;
    }
    public int getB() {
        return b;
    }
}