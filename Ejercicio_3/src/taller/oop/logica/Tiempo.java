package taller.oop.logica;

public class Tiempo {
    private int horas;
    private int minutos;
    private double segundos;

    public Tiempo(int horas, int minutos, double segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public Object[] toArray(int contador) {
        return new Object[] {contador, this.horas, this.minutos, this.segundos};
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public double getSegundos() {
        return segundos;
    }

    public void setSegundos(double segundos) {
        this.segundos = segundos;
    }
    
    
}
