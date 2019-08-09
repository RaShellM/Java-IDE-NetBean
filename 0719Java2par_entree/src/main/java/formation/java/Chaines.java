/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.java;

/**
 *
 * @author Administrateur
 */
public class Chaines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String txt = "bonjour les écoliers, ";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.length());
       
        txt += "c'est la concaténation de deux string ici";
        System.out.println(txt);
        String a = "bonjour";
        String b = "bon"+"jour"; // ici redistribue sur la mémoire du a car c'est en concaténation d'une chaine de car
        String c = "bon";
        String d = c+"jour";
        System.out.println(a + b + " compare si a = = b " + (a==b) );
        System.out.println(a + d + " compare si a = = d " + (a==d) );
        System.out.println(" compare si a equals b "+(a.equals(b)));
        System.out.println(monConcat("il fait", "chaud"));
    }
   
    static String monConcat(String s1, String s2){
        StringBuilder sb = new StringBuilder(s1);
        StringBuilder sb1 = sb.append(s2);
        return sb1.toString();
    }
   
}
