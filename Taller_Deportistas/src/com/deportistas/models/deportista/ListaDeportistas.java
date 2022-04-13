package com.deportistas.models.deportista;

import com.deportistas.lista.Lista;
import com.deportistas.models.deportista.gateways.DeportistasFactory;

public class ListaDeportistas extends Lista<Deportista> {

    public ListaDeportistas(){
        super(DeportistasFactory.getInstance());
    }

    

    @Override
    public void add(Deportista deportista){
        if(exist(deportista.getId())){
            throw new IllegalArgumentException("Error el deportista ya existe");
        }
        super.add(deportista);
    }
    
    private boolean exist(String id){
        if(id == null){
            throw new IllegalArgumentException("Error idDeportista no puede ser nulo.");
        }
        if (this.head == null){
            return false;
        }
        Deportista aux = this.head;
        do {
            if(id.equals(aux.getId())){
                return true;
            }
            aux = cast(aux.next());
        } while (!(aux.next().equals(this.head)));
        return false;
    }
    
    

}
