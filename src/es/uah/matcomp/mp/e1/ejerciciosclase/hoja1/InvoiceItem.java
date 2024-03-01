package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem() {
        id = "A101";
        desc = "Pen red";
        qty = 888;
        unitPrice = 10.9;

    }

    public InvoiceItem(String i, String d, int q, double u) {
        id = i;
        desc = d;
        qty = q;
        unitPrice = u;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int newQty) {
        qty = newQty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double newUnitPrice) {
        unitPrice = newUnitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    public String toString() {
        return "es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.InvoiceItem[id=" + id + " desc=" + desc + " qty=" + qty + " unitPrice=" + unitPrice + "]";
    }

}
