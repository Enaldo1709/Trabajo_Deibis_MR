package taller.oop.logica;


public class Factura {
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Factura(String numeroPieza, String descripcion, int numero, double precioUnitario) {
        this.numeroPieza = numeroPieza;
        this.descripcion = descripcion;
        this.cantidad = numero<=0?0:numero;
        this.precioUnitario = precioUnitario<=0?0:precioUnitario;
    }
    
    public Object[] toArray(int contador) {
        return new Object[] {
            contador, this.numeroPieza, this.descripcion, this.cantidad, 
            this.precioUnitario, this.getMonto()
        };
    }
    
    public double getMonto() {
        return (double) cantidad*precioUnitario;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int numero) {
        this.cantidad = numero;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
    
}
