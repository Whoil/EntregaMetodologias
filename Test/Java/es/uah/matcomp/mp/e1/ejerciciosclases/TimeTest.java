package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void testTodo() {
        Time t = new Time(1, 2, 3);

        assertEquals(1, t.getHour());
        assertEquals(2, t.getMinute());
        assertEquals(3, t.getSecond());

        t.setHour(10); t.setMinute(20); t.setSecond(30);
        assertEquals("10:20:30", t.toString());

        t.setHour(24); t.setMinute(60); t.setSecond(60); // inválidos
        assertEquals("10:20:30", t.toString());

        t.setTime(4, 5, 6);
        assertEquals("04:05:06", t.toString());

        t.setTime(23, 59, 59);
        assertEquals("00:00:00", t.nextSecond().toString());

        t.setTime(0, 0, 0);
        assertEquals("23:59:59", t.previousSecond().toString());
    }
}