package com.deportistas.models.disciplinas;

import com.deportistas.lista.Lista;
import com.deportistas.lista.Nodo;
import com.deportistas.models.disciplinas.gateways.DisciplinaFactory;

public class ListaDisciplina extends Lista<Disciplina> {
    public ListaDisciplina(){
        super(DisciplinaFactory.getInstance());
    }

    @Override
    public void add(Nodo<Disciplina> disciplina){
        if (disciplina == null){
            throw new NullPointerException("Error la disciplina no puede ser nula");
        }
        if(exist(cast(disciplina).getName())){
            throw new IllegalArgumentException("Error la disciplina ya existe");
        }
        super.add(disciplina);
    }

    public void add(String disciplina){
        if (disciplina == null){
            throw new NullPointerException("Error la disciplina no puede ser nula");
        }
        Disciplina disciplina2 = new Disciplina(disciplina);
        if(exist(disciplina)){
            throw new IllegalArgumentException("Error la disciplina ya existe");
        }
        super.add(disciplina2);
    }

    public boolean exist(String name){
        if(name == null){
            throw new NullPointerException("Error nombre de la disciplina no puede ser nulo.");
        }
        if (this.head == null){
            return false;
        }
        Nodo<Disciplina> aux = this.head;
        do {
            if(name.equals(cast(aux).getName())){
                return true;
            }
            aux = cast(aux.next());
        } while (!(aux.next().equals(this.head)));
        return false;
    }
    
}
