package com.deportistas.models.deportista;

import com.deportistas.lista.Nodo;
import com.deportistas.models.disciplinas.Disciplina;


public class Deportista extends Nodo<Deportista> {
    private String id;
    private String nombre;
    private Disciplina disciplina;
    private int experiencia;

    public Deportista(){
        super();
    }

    public Deportista(String id, String nombre, Disciplina disciplina, int experiencia) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.disciplina = disciplina;
        this.experiencia = experiencia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
