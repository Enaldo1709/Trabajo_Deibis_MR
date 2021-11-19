package taller.oop.logica;

import java.util.ArrayList;

public class Teatro {
    private String nombre;
    private String direccion;
    private ArrayList<Funcion> funciones;
    private int maxFunciones;

    public Teatro(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.funciones = new ArrayList<Funcion>();
        this.maxFunciones = 4;
    }
    
    public Object[] toArray(int contador, int index) {
        return new Object[] {
            index, this.nombre, this.direccion, this.funciones.get(index).getNombre(),
            this.funciones.get(index).getPrecio()
        };
    }
            
    public void addFuncion(Funcion funcion) throws ArrayIndexOutOfBoundsException{
        if(this.funciones.size()<this.maxFunciones) this.funciones.add(funcion);
        else throw new ArrayIndexOutOfBoundsException();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecciones() {
        return direccion;
    }

    public void setDirecciones(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }

    public int getMaxFunciones() {
        return maxFunciones;
    }

    public void setMaxFunciones(int maxFunciones) {
        this.maxFunciones = maxFunciones;
    }
    
    
    
}
