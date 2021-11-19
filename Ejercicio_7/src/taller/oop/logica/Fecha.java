package taller.oop.logica;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private int[] meses31 = {1,3,5,7,8,10,12};
    
    public Fecha(int dia, int mes, int anio) throws IllegalArgumentException{
        if (have31(mes)){
            if(dia >= 1 && dia <=31) this.dia = dia;
            else throw new IllegalArgumentException();
        } else {
            if (dia >= 1 && dia <=30) this.dia = dia;
            else throw new IllegalArgumentException();
        }
        if (mes >= 1 && mes <= 12) this.mes = mes;
        else throw new IllegalArgumentException();
        
        this.anio = anio;
    }
    
    public Object[] toArray(int index){
        return new Object[]{
            index, this.getFecha()
        };
    }
    
    private boolean have31(int mes){
        for (int i:meses31){
            if(mes==i) return true;
        }
        return false;
    }
    
    public String getFecha() {
        return ""+dia+"/"+mes+"/"+anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}
