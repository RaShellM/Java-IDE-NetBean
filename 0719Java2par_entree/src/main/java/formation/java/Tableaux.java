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
public class Tableaux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] table1;
       Scanner sc = new Scanner(System.in);
       System.out.println("entrez un nombre qui donnera la longueur du tableau");
       String txt = sc.nextLine();
       int valeur = Integer.parseInt(txt);
       table1 = new int [valeur]; // donne le nombre d'éléments du tableau, cette taille sera fixée, et le tableau ne pourra pas être alongé
       for (int i=0; i<table1.length; ++i) table1[i] = i;
       for (int k : table1){
           System.out.println(k);
       }
       
       int [] table2 = {1,2,3,7,8}; //syntaxe uniquement possible pour l'initialisation de la variable
       table2 = table1; // ici on assigne la mm adresse de mémoire aux 2 tableaux, celle de l'adresse 1 
       System.out.println("la 'eme valeur du tableau 2 est " + table2[4]);
       table2[0]=-999;
       System.out.println(table1[0]); // ici on remarque que le table 1 prend la valeur du table 2;
       for (int k : table1){
           System.out.println(k); // ici on remarque que les valeurs initialisées du tableau 2 ,'existent plus, elles sont qqpart en mémoire mais plus accessible par la programme
       } 
       
    }
    
}
