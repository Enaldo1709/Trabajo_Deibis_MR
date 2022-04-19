package com.deportistas.lista.gateway;

import com.deportistas.lista.Nodo;

public interface NodoFactory<T extends Nodo<T>> {
    public T cast(Nodo<T> nodo);
}
