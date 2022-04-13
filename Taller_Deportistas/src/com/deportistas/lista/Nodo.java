package com.deportistas.lista;

import com.deportistas.lista.gateway.NodoFactory;

public class Nodo<T extends Nodo> {
    private long index;
    private Nodo next;
    
    public Nodo(){
        this.next = null;
    }
    
    public Nodo(T next){
        this.next = next;
    }
    
    public void setNext(Nodo next){
        this.next = next;
    }
    
    public Nodo next(){
        return this.next;
    }
    
    public void setIndex(long index){
        this.index = index;
    }
    
    public long index(){
        return this.index;
    }
}
