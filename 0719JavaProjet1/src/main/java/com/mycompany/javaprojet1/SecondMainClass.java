/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaprojet1;

/**
 *
 * @author Administrateur
 */
public class SecondMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("deuxieme entree main");
        trois t = new trois();
        t.setValeur("10");
        System.out.println(t.getValeur());
        NewMain nm = new NewMain();
        nm.m1(7);
    }
    
}

   class trois {
   
    private String valeur;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getValeur() {
        return valeur;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setValeur(String string) {
        this.valeur = string;
    }

}
