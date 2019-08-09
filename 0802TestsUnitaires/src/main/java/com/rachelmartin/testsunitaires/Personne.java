/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rachelmartin.testsunitaires;

/**
 *
 * @author Administrateur
 */
public class Personne {

    public Personne(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    public Personne() {
    }
    
    
    private int age;

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) throws Exception {
        if (age<0) throw new Exception("age négatif impossible");
        this.age = age;
        }

    private String nom;

    /**
     * Get the value of nom
     *
     * @return the value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the value of nom
     *
     * @param nom new value of nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    
}
