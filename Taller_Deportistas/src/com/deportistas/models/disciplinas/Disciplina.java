package com.deportistas.models.disciplinas;

import com.deportistas.lista.Nodo;

public class Disciplina extends Nodo<Disciplina>{
    private String name;

    public Disciplina() {}
    public Disciplina(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
