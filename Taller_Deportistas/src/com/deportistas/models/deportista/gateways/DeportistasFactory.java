package com.deportistas.models.deportista.gateways;

import com.deportistas.lista.Nodo;
import com.deportistas.lista.gateway.NodoFactory;
import com.deportistas.models.deportista.Deportista;

public class DeportistasFactory implements NodoFactory<Deportista> {
    private static DeportistasFactory instance = null;
    
    private DeportistasFactory(){

    }

    public static DeportistasFactory getInstance(){
        if(instance == null){
            instance = new DeportistasFactory();
        }
        return instance;
    }

    @Override
    public Deportista cast(Nodo<Deportista> nodo) {
        Deportista deportista = new Deportista();
        deportista.setIndex(nodo.index());
        deportista.setNext(nodo.next());
        deportista.setPrev(nodo.prev());
        return deportista;
    }
    
}
