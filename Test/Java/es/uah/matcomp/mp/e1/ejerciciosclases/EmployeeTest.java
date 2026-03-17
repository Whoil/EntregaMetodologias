package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testTodo() {
        Employee e = new Employee(1, "Juan", "Perez", 1000);

        assertEquals(1, e.getId());
        assertEquals("Juan", e.getFirstName());
        assertEquals("Perez", e.getLastName());
        assertEquals("JuanPerez", e.getName());
        assertEquals(1000, e.getSalary());

        e.setSalary(1500); // caso válido
        assertEquals(1500, e.getSalary());

        e.setSalary(-100); // caso no válido
        assertEquals(1500, e.getSalary());

        assertEquals(1500 * 12, e.getAnnualSalary());

        assertEquals(1650, e.raiseSalary(10)); // subida del 10%
        assertEquals(1650, e.getSalary());

        assertEquals("Employee[id=1,name=JuanPerez,salary=1650]", e.toString());
    }
}