package com.kaoutar.org.design.patterns.simpleExample;


interface Strategy {
    void execute();
}
class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Exécution de la stratégie A");
    }
}

class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Exécution de la stratégie B");
    }
}
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        if (strategy != null) {
            strategy.execute();
        } else {
            System.out.println("Aucune stratégie définie");
        }
    }
}
