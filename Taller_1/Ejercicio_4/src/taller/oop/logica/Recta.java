    package taller.oop.logica;

public class Recta {
    private Punto punto;
    private double pendiente;
    
    public Recta(Punto punto, double pendiente) {
        this.punto = punto;
        this.pendiente = pendiente;
    }
    
    public String getEcuacion(){
        double b = punto.getY() - (pendiente * punto.getX());
        return ("y = "+ ((pendiente>=0)?"":"-")+Math.abs(pendiente)+"*x "+ 
                ((b>=0)?"+ ":"- ") + Math.abs(b));
    }
    
    public Object[] toArray(int index){
        return new Object[]{
            index, this.punto.getPunto(), this.pendiente, this.getEcuacion()
        };
    }
    
    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public double getPendiente() {
        return pendiente;
    }

    public void setPendiente(double pendiente) {
        this.pendiente = pendiente;
    }
}
