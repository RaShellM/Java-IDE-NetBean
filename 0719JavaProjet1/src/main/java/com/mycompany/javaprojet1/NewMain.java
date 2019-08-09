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

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println
        ("le travail reprend/// la pause de midi est terminee");//return;
        m1(1);
    }
    /**
     * Methode ecite pour montrer l'usage de l'annotation deprecated
     * @param i parametre qui ne sert à rien
     * @deprecated
     */
    @Deprecated
    public static void m1(int i){
        System.out.println("dans m1");
                }
    //@Override
    
}
