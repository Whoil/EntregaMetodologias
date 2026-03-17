package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void testTodo() {
        InvoiceItem i = new InvoiceItem("1", "Lapiz", 2, 1.5);

        assertEquals("1", i.getId());
        assertEquals("Lapiz", i.getDesc());
        assertEquals(2, i.getQty());
        assertEquals(1.5, i.getUnitPrice());

        i.setQty(5);
        i.setUnitPrice(2.0);
        assertEquals(5, i.getQty());
        assertEquals(2.0, i.getUnitPrice());

        assertEquals(10.0, i.getTotal());

        assertEquals("InvoiceItem[id=1,desc=Lapiz,qty=5,unitPrice=2.0]", i.toString());
    }
}