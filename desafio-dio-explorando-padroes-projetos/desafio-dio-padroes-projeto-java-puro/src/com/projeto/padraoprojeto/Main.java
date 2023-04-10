package com.projeto.padraoprojeto;

import com.projeto.padraoprojeto.facade.Facade;
import com.projeto.padraoprojeto.singleton.SingletonEager;
import com.projeto.padraoprojeto.singleton.SingletonLazy;
import com.projeto.padraoprojeto.singleton.SingletonLazyHolder;
import com.projeto.padraoprojeto.strategy.Comportamento;
import com.projeto.padraoprojeto.strategy.ComportamentoAgressivo;
import com.projeto.padraoprojeto.strategy.ComportamentoDefensivo;
import com.projeto.padraoprojeto.strategy.ComportamentoNormal;
import com.projeto.padraoprojeto.strategy.Robo;

public class Main {
    public static void main(String[] args) throws Exception {

        // Testes relacionados ao Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Testes relacionados ao Design Pattern Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Testes relacionados ao Design Pattern Facade
        Facade facade = new Facade();
        facade.migrarCliente("Vicente", "11111111");

    }
}
