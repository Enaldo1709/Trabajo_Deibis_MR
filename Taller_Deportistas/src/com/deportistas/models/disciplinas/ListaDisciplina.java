package com.deportistas.models.disciplinas;

import com.deportistas.lista.Lista;
import com.deportistas.models.disciplinas.gateways.DisciplinaFactory;

public class ListaDisciplina extends Lista<Disciplina> {
    public ListaDisciplina(){
        super(DisciplinaFactory.getInstance());
    }

    @Override
    public void add(Disciplina disciplina){
        
    }
    
}
