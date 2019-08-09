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
public class Saisiemod {
    public String s =Lit();
    public static String Lit(){
        Scanner sc = new Scanner(System.in);
         return sc.nextLine();
    }
    public Saisiemod(){
     
        System.out.print("vous avez tapé : " + s);
    }
}
