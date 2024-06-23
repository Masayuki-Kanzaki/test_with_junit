package mypackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintTest {

    @Test
    void paint() {
        Paint yellow = new Paint(100.0, 0, 50, 0);
        Paint blue   = new Paint(100.0, 0, 0, 50);

        yellow.paint(blue);

        assertEquals(200.0,yellow.getV(), 0.01);
        assertEquals(0,yellow.getR());
        assertEquals(50,yellow.getY());
        assertEquals(0,yellow.getB());
    }
}