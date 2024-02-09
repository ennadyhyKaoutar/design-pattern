package com.kaoutar.org.design.patterns.simpleExample;

public class singleton {
    
    private static singleton instance;

    private singleton() {
    }

    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        // Retourne l'instance unique
        return instance;
    }

    // Méthode d'exemple
    public void showMessage() {
        System.out.println("Hello, je suis un Singleton !");
    }
}

