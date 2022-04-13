package com.deportistas.lista;

import com.deportistas.lista.gateway.NodoFactory;

public class Lista<T extends Nodo>{
    protected T head;
    private NodoFactory<T> factory;
    
    public Lista(NodoFactory<T> factory){
        this.head = null;
        this.factory = factory;
    }
    
    public T getHead(){
        return head;
    }
    
    public T last(){
        if (head == null){
            return null;
        }
        T last = head;
        do{
            last = factory.cast(last.next());
        }while(!last.next().equals(head));
        return last;
    }
    
    public void setHead(T head){
        head.setIndex(0);
        if (this.head == null) {
            this.head = head;
            this.head.setNext(this.head);
        } else {
            Nodo last = this.last();
            updateIndexes(1);
            head.setNext(this.head);
            last.setNext(head);
            this.head = head;
        }
    }
    
    public void add(T nodo){
        if (this.head == null){
            this.setHead(nodo);
            return;
        }
        T last = this.last();
        nodo.setIndex(last.index()+1);
        last.setNext(nodo);
        nodo.setNext(this.head);
    }
    
    public long size(){
        long size = 0;
        if (this.head != null){
            Nodo aux = this.head;
            do{
                size++;
                aux=aux.next();
            }while(!(aux.equals(this.head)));
        }
        return size;
    }
    
    public T get(long index) throws IllegalArgumentException{
        if(index < 0){
            throw new IllegalArgumentException("Error obtaining node, index must can't be less than 0.");
        }
            
        T nodo = null;
        T aux = this.head;
        do{
            if(aux.index() == index){
                nodo = aux;
                break;
            }
            aux = factory.cast(aux.next());
        }while(!aux.next().equals(this.head));
        return nodo;
    }
    
    public void delete(long index) throws IndexOutOfBoundsException{
        Nodo nodo = this.get(index);
        if(nodo == null){
            throw new IndexOutOfBoundsException(String.format("Cannot delete node %d: Node not exist in list.", index));
        }
        
        if(this.head.equals(nodo)){
            setHead(factory.cast(this.head.next()));
        } else {
            T prev = (index == 0)?this.last():this.get(index-1);
            prev.setNext(nodo.next());
            updateIndexes();
            nodo = null;
        }
    }
    
    public void set(long index, T nodo){
        if (index == 0){
            this.setHead(nodo);
            return;
        }
        Nodo old = this.get(index);
        Nodo prev = this.get(index - 1);
        nodo.setNext(old);
        prev.setNext(nodo);
        updateIndexes();
    }
    
    protected T cast(Nodo nodo){
        return this.factory.cast(nodo);
    }
    
    private void updateIndexes(){
        this.updateIndexes(0);
    }
    
    private void updateIndexes(long offset){
        if (this.head == null){
            return;
        }
        Nodo aux = this.head;
        long cont = offset;
        do {            
            aux.setIndex(cont);
            cont++;
            aux=aux.next();
        } while (!aux.next().equals(this.head));
    }
}
