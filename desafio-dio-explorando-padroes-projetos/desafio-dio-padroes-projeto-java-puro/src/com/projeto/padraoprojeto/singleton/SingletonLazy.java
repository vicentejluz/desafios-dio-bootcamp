package com.projeto.padraoprojeto.singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author vicentejluz
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}