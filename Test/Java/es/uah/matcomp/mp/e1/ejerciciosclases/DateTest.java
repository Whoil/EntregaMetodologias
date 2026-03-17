package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void testTodo() {
        Date d = new Date(5, 6, 2024);
        assertEquals(5, d.getDay());
        assertEquals(6, d.getMonth());
        assertEquals(2024, d.getYear());

        d.setDay(10);
        d.setMonth(11);
        d.setYear(2025);
        assertEquals(10, d.getDay());
        assertEquals(11, d.getMonth());
        assertEquals(2025, d.getYear());

        d.setDay(0);
        d.setMonth(0);
        d.setYear(0);
        assertEquals(10, d.getDay());
        assertEquals(11, d.getMonth());
        assertEquals(2025, d.getYear());

        d.setDate(3, 4, 2030);
        assertEquals(3, d.getDay());
        assertEquals(4, d.getMonth());
        assertEquals(2030, d.getYear());
        assertEquals("03/04/2030", d.toString());

        d.setDate(13, 12, 2031);
        assertEquals("13/12/2031", d.toString());
    }
}