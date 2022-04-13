package com.deportistas.lista.gateway;

import com.deportistas.lista.Nodo;

public interface NodoFactory<T extends Nodo> {
    public T cast(Nodo nodo);
}
