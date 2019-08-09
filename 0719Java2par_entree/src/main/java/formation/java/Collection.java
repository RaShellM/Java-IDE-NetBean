/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.java;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Administrateur
 */
public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       System.out.println("______________VECTOR_______________");
       Vector<String> liste =new Vector<String>();
       liste.add("Java c'est sympa");
       liste.add("vive Java");
    
       for (int i=0; i<liste.size(); i++){
           System.out.println(liste.elementAt(i).toString());
       }
       
       System.out.println("_____________ARRAY LIST_______________");
       ArrayList<String> catalogue = new ArrayList<>();
       catalogue.add("Java c'est sympa");
       catalogue.add("vive Java");
       
       for (int i=0; i<catalogue.size(); ++i){
           System.out.println(catalogue.get(i));
        }
       System.out.println(catalogue.contains("vive")); // ici on vérifie si un élément du tableau liste contient la valeur exacte 
    }
    
}
