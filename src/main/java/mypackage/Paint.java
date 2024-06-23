package mypackage;

public class Paint {
    double volume;
    int red;
    int yellow;
    int blue;
    Paint(double v, int r, int y, int b) {
        this.volume = v;
        this.red = r;
        this.yellow = y;
        this.blue = b;
    }
    public void mixIn(Paint paint) {
        volume = volume + paint.getVolume();

        double ratio = paint.getVolume() / volume;

        mixedWith(paint, ratio);
    }
    public double getVolume() {
        return volume;
    }
    public int getRed() {
        return red;
    }
    public int getYellow() {
        return yellow;
    }
    public int getBlue() {
        return blue;
    }
    public void mixedWith(Paint paint, double ratio) {
        red    = (int) (red    * ratio + paint.getRed()    * ratio);
        yellow = (int) (yellow * ratio + paint.getYellow() * ratio);
        blue   = (int) (blue   * ratio + paint.getBlue()   * ratio);
    }
}