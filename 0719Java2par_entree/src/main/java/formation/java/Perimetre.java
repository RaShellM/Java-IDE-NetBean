/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.java;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Perimetre {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        
        System.out.println("saisissez le rayon de votre cercle");
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        //float f = (float)txt; //IMPOSSIBLE : on ne peut pas faire une conversion de string à float directement 
        float rayon = Float.parseFloat(txt.trim());
        float perimetre = rayon * 2 * 3.14f; // ici on aura un type float (précision à 6 chiffres apres virgule
        System.out.println("Le périmètre est de : " + perimetre );
        // ecriture équivalente mais plus compliquée à lire ci dessous
        // System.out.println("Le périmètre est de : " + Float.parseFloat(sc.nextLine().trim())* 2 * 3.14f);
        
        System.out.println("un autre rayon (F pour terminer)");
        while(!(txt = sc.nextLine()).toUpperCase().equals("F")){
            var p = Float.parseFloat(txt.trim())* 2 * 3.14; //ici on aura un type double (car 3.14 non précisé)
            System.out.println("permiètre : "+p);
            System.out.println("Rayon ? (F pour terminer) ");
         }
    }
    
}
