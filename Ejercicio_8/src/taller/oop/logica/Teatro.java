package taller.oop.logica;

import java.util.ArrayList;

public class Teatro {
    private String nombre;
    private String direccion;
    private ArrayList<Funcion> funciones;
    private int numeroFunciones;

    public Teatro(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.funciones = new ArrayList<Funcion>();
        this.numeroFunciones = 0;
    }
    
    public Object[] toArray(int contador, int index) {
        return new Object[] {
            contador, this.nombre, this.direccion, this.funciones.get(index).getNombre(),
            this.funciones.get(index).getPrecio()
        };
    }
            
    public Teatro addFuncion(Funcion funcion) throws ArrayIndexOutOfBoundsException{
        if(this.numeroFunciones < 4) {
            this.funciones.add(funcion);
            this.numeroFunciones++;
        }        
        else throw new ArrayIndexOutOfBoundsException();
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
        this.numeroFunciones = this.funciones.size();
    }

    public int getNumeroFunciones() {
        return numeroFunciones;
    }
    

}
