package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff s = new Staff("Mónica", "Alcalá", "UAH", 2000);
        assertEquals("UAH", s.getSchool());
    }

    @Test
    void setSchool() {
        Staff s = new Staff("Mónica", "Alcalá", "UAH", 2000);
        s.setSchool("UCM");
        assertEquals("UCM", s.getSchool());
    }

    @Test
    void getPay() {
        Staff s = new Staff("Mónica", "Alcalá", "UAH", 2000);
        assertEquals(2000, s.getPay());
    }

    @Test
    void setPay() {
        Staff s = new Staff("Mónica", "Alcalá", "UAH", 2000);
        s.setPay(3000);
        assertEquals(3000, s.getPay());
    }

    @Test
    void testToString() {
        Staff s = new Staff("Mónica", "Alcalá", "UAH", 2000.0); // lo pnemos así porque pay es double
        assertEquals("Staff[Person[name=Mónica,address=Alcalá],school=UAH,pay=2000]", s.toString());
    }
}