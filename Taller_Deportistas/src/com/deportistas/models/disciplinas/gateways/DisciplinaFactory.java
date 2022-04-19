package com.deportistas.models.disciplinas.gateways;

import com.deportistas.lista.Nodo;
import com.deportistas.lista.gateway.NodoFactory;
import com.deportistas.models.disciplinas.Disciplina;

public class DisciplinaFactory implements NodoFactory<Disciplina> {
    private static DisciplinaFactory factory;

    private DisciplinaFactory(){
      
    }

    public static DisciplinaFactory getInstance(){
        if(factory == null){
            factory = new DisciplinaFactory();
        }
        return factory;
    }

    @Override
    public Disciplina cast(Nodo<Disciplina> nodo) {
        if (nodo == null){
            return null;
        }
        if (nodo instanceof Disciplina){
            return (Disciplina) nodo;
        }
        Disciplina disciplina = new Disciplina();
        disciplina.setIndex(nodo.index());
        if(nodo.next() != null){
            disciplina.setNext(nodo.next());
        }
        if (nodo.prev() != null){
            disciplina.setPrev(nodo.prev());     
        }
        return disciplina;
    }
    
}
