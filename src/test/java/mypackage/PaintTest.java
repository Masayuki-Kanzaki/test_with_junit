package mypackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintTest {

    @Test
    void paint() {
        Paint ourPaint = new Paint(100.0, 0, 50, 0);
        Paint blue     = new Paint(100.0, 0, 0, 50);

        ourPaint.mixIn(blue);

        assertEquals(200.0, ourPaint.getVolume(), 0.01);
        assertEquals(0, ourPaint.getRed());
        assertEquals(25, ourPaint.getYellow());
        assertEquals(25, ourPaint.getBlue());
    }
}