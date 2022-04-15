package com.deportistas.lista;

import com.deportistas.lista.gateway.NodoFactory;

public class Lista<T extends Nodo<T>>{
    protected Nodo<T> head;
    private NodoFactory<T> factory;
    
    public Lista(NodoFactory<T> factory){
        this.head = null;
        this.factory = factory;
    }
    
    public Nodo<T> getHead(){
        return head;
    }
    
    public Nodo<T> last(){
        if (head == null){
            return null;
        }
        return head.prev();
    }
    
    public void setHead(Nodo<T> head){
        head.setIndex(0);
        if (this.head == null) {
            this.head = head;
            this.head.setNext(this.head);
            this.head.setPrev(this.head);
        } else {
            updateIndexes(1);
            Nodo<T> last = this.last();
            head.setPrev(last);
            head.setNext(this.head);
            this.head.setPrev(head);
            last.setNext(head);
            this.head = head;
        }
    }
    
    public void add(Nodo<T> nodo){
        if (this.head == null){
            this.setHead(nodo);
            return;
        }
        Nodo<T> last = this.last();
        nodo.setIndex(last.index()+1);
        last.setNext(nodo);
        nodo.setNext(this.head);
        nodo.setPrev(last);
    }
    
    public long size(){
        return last().index()+1;
    }
    
    public Nodo<T> get(long index) throws IllegalArgumentException, IndexOutOfBoundsException{
        if(index < 0){
            throw new IllegalArgumentException("Error obtaining node, index can't be less than 0.");
        }
        if(index > last().index()){
            throw new IndexOutOfBoundsException("Index is out of list bounds.");
        }
        Nodo<T> nodo = null;
        Nodo<T> aux = this.head;
        do{
            if(aux.index() == index){
                nodo = aux;
                break;
            }
            aux = aux.next();
        }while(!aux.next().equals(this.head));
        return nodo;
    }
    
    public void delete(long index) {
        Nodo<T> nodo = this.get(index);
                
        if(this.head.equals(nodo)){
            setHead(factory.cast(this.head.next()));
        } else {
            Nodo<T> prev = (index == 0)?this.last():this.get(index-1);
            prev.setNext(nodo.next());
            updateIndexes();
        }
    }
    
    public void set(long index, T nodo){
        if (index == 0){
            this.setHead(nodo);
            return;
        }
        Nodo<T> old = this.get(index);
        Nodo<T> prev = this.get(index - 1);
        nodo.setPrev(factory.cast(prev));
        nodo.setNext(factory.cast(old));
        old.setPrev(nodo);
        prev.setNext(nodo);
        updateIndexes();
    }
    
    protected T cast(Nodo<T> nodo){
        return this.factory.cast(nodo);
    }
    
    private void updateIndexes(){
        this.updateIndexes(0);
    }
    
    private void updateIndexes(long offset){
        if (this.head == null){
            return;
        }
        Nodo<T> aux = this.head;
        long cont = offset;
        do {            
            aux.setIndex(cont);
            cont++;
            aux=aux.next();
        } while (!aux.next().equals(this.head));
    }
}
