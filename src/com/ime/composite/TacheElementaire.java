package com.ime.composite;

public class TacheElementaire implements Tache{
    private String nom;
    private int cout;

    public TacheElementaire( String nom, int cout){
       this.nom=nom;
       this.cout=cout;
    }

    public String getNoms() {
        return nom;
    }

}
