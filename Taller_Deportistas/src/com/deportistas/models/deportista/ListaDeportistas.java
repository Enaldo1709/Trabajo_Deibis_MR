package com.deportistas.models.deportista;

import com.deportistas.lista.Lista;
import com.deportistas.lista.Nodo;
import com.deportistas.models.deportista.gateways.DeportistasFactory;

public class ListaDeportistas extends Lista<Deportista> {

    public ListaDeportistas(){
        super(DeportistasFactory.getInstance());
    }

    public void add(Nodo<Deportista> deportista){
        if (deportista == null){
            throw new NullPointerException("Error el deportista no puede ser nulo");
        }
        if(exist(cast(deportista).getId())){
            throw new IllegalArgumentException("Error el deportista ya existe");
        }
        super.add(deportista);
    }
    
    public boolean exist(String id){
        if(id == null){
            throw new NullPointerException("Error idDeportista no puede ser nulo.");
        }
        if (this.head == null){
            return false;
        }
        Nodo<Deportista> aux = this.head;
        do {
            if(id.equals(cast(aux).getId())){
                return true;
            }
            aux = cast(aux.next());
        } while (!(aux.next().equals(this.head)));
        return false;
    }

    public ListaDeportistas sort(){
        ListaDeportistas lista = new ListaDeportistas();
        lista.setHead(cast(this.head));
        Nodo<Deportista> aux = lista.getHead();
        int intercambios = 0;
        do {
            do {
                if(cast(aux).compareTo(cast(aux.next()))){
                    swap(aux.index(), aux.next().index());
                    intercambios++;
                }
                aux = aux.next();
            } while (!aux.next().equals(lista.getHead()));
        } while (intercambios == 0);
        lista.updateHead();
        return lista;
    }
    
}
