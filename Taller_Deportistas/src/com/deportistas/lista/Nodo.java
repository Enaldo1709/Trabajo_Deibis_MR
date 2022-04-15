package com.deportistas.lista;

public class Nodo<T extends Nodo<T>> {
    private long index;
    private Nodo<T> next;
    private Nodo<T> prev;
    
    public Nodo(){
        this.next = null;
        this.prev = null;
    }
    
    public Nodo(Nodo<T> next, Nodo<T> prev){
        this.next = next;
        this.prev = prev;
    }
    
    public void setNext(Nodo<T> next){
        this.next = next;
    }
    
    public Nodo<T> next(){
        return this.next;
    }

    public void setPrev(Nodo<T> prev){
        this.prev = prev;
    }

    public Nodo<T> prev(){
        return this.prev;
    }
    
    public void setIndex(long index){
        this.index = index;
    }
    
    public long index(){
        return this.index;
    }
}
