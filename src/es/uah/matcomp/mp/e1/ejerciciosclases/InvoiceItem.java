package es.uah.matcomp.mp.e1.ejerciciosclases;

// Clase que representa un producto dentro de una factura
public class InvoiceItem {
    private String id;        // Identificador del producto
    private String desc;      // Descripción
    private int qty;          // Cantidad
    private double unitPrice; // Precio por unidad

    // Constructor que inicializa todos los atributos
    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Devuelve el id
    public String getId(){
        return id;
    }

    // Devuelve la descripción
    public String getDesc(){
        return desc;
    }

    // Devuelve la cantidad
    public int getQty(){
        return qty;
    }

    // Modifica la cantidad
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Devuelve el precio unitario
    public double getUnitPrice(){
        return unitPrice;
    }

    // Modifica el precio unitario
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Calcula el total (precio * cantidad)
    public double getTotal(){
        return unitPrice * qty;
    }

    // Devuelve la información en formato texto
    public String toString(){
        return "InvoiceItem[id="+ id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}
