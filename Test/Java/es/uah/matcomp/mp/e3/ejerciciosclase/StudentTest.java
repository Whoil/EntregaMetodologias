package es.uah.matcomp.mp.e3.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student s = new Student("Álvaro", "Alcalá", "Matemáticas y computación", 2, 1000);
        assertEquals("Matemáticas y computación", s.getProgram());
    }

    @Test
    void setProgram() {
        Student s = new Student("Álvaro", "Alcalá", "Matemáticas y computación", 2, 1000);
        s.setProgram("Física");
        assertEquals("Física", s.getProgram());
    }

    @Test
    void getYear() {
        Student s = new Student("Álvaro", "Alcalá", "Matemáticas y computación", 2, 1000);
        assertEquals(2, s.getYear());
    }

    @Test
    void setYear() {
        Student s = new Student("Álvaro", "Alcalá", "Matemáticas y computación", 2, 1000);
        s.setYear(3);
        assertEquals(3, s.getYear());
    }

    @Test
    void getFee() {
        Student s = new Student("Álvaro", "Alcalá", "Matemáticas y computación", 2, 1000);
        assertEquals(1000.0, s.getFee());
    }

    @Test
    void setFee() {
        Student s = new Student("Álvaro", "Alcalá", "Matemáticas y computación", 2, 1000);
        s.setFee(1500);
        assertEquals(1500.0, s.getFee());
    }

    @Test
    void testToString() {
        Student s = new Student("Álvaro", "Alcalá", "Matemáticas y computación", 2, 1000);
        assertEquals("Student[Person[name=Álvaro,address=Alcalá],program=Matemáticas y computación,year=2,fee=1000.0]", s.toString());
    }
}