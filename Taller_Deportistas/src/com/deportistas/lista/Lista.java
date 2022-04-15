package com.deportistas.lista;

import com.deportistas.lista.gateway.NodoFactory;

public class Lista<T extends Nodo<T>>{
    protected Nodo<T> head;
    protected NodoFactory<T> factory;
    
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
            if (this.head.equals(this.head.next())){
                this.head = null;
            } else {
                setHead(this.head.next());
            }
        } else {
            Nodo<T> prev = (index == 0)?this.last():this.get(index-1);
            prev.setNext(nodo.next());
            updateIndexes();
        }
    }
    
    public void set(long index, T nodo){
        if(index < 0 || index > this.size()){
            throw new IndexOutOfBoundsException("Error index provided is invalid.");
        }
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

    protected void updateHead(){
        this.head = get(0);
    }

    protected void swap(long i1, long i2){
        Nodo<T> n1 = get(i1);
        Nodo<T> n2 = get(i2);
        Nodo<T> aux = cast(n1);

        n1.prev().setNext(n2);
        n2.prev().setNext(n1);
        n1.setPrev(n2.prev());
        n2.setPrev(aux.prev());
        n1.setNext(n2.next());
        n2.setNext(aux.next());
        n1.setIndex(n2.index());
        n2.setIndex(aux.index());
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
