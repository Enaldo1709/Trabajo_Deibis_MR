package taller.oop.logica;

/**
 *
 * @author enaldo1709
 */
public class Coche {
    private String color;
    private String marca;
    private String modelo;
    private int puertas;
    private double caballos;
    private String matricula;

    public Coche(String color, String marca, String modelo, int puertas, 
            double caballos, String matricula) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.caballos = caballos;
        this.matricula = matricula;
    }
    
    public Object[] toArray(int numero) {
        Object[] array = { numero, this.color, this.marca, this.modelo, 
            this.puertas, this.caballos, this.matricula};
        return array;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getCaballos() {
        return caballos;
    }

    public void setCaballos(double caballos) {
        this.caballos = caballos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
