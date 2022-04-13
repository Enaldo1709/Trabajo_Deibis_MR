package taller.oop.logica;

public class Rectangulo {
    private double longitud;
    private double ancho;
    private double area;
    private double perimetro;

    public Rectangulo() {
        this.longitud = 0;
        this.ancho = 0;
        this.area = this.longitud * this.ancho;
        this.perimetro = 2 * (this.longitud + this. ancho);
    }
    
    public Rectangulo(double longitud,double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
        this.area = this.longitud * this.ancho;
        this.perimetro = 2 * (this.longitud + this. ancho);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
        this.area = this.longitud * this.ancho;
        this.perimetro = 2 * (this.longitud + this. ancho);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
        this.area = this.longitud * this.ancho;
        this.perimetro = 2 * (this.longitud + this. ancho);
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    
    
}
