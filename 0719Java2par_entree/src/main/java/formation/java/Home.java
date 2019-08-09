/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.java;

import outils.java.Saisie;

/**
 *
 * @author Administrateur
 */
public class Home {
int i;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Nombre de paramètres ");
        System.out.println(args.length);
        
        for (String x: args){
            System.out.println(x);  //boucle sans i
        }
        for (int i=0; i<args.length; ++i){  //boucle qui nécessite de passer par i
        System.out.println("Parametre n° " + Integer.toString(i) + "; " + args[i]);
        }
        
        System.out.println("saisissez une valeur");
        String s = Saisie.Lit();
        System.out.print("vous avez saisi : " + s + "et maintenant saisissez à nouveau");
        
        Saisiemod sm = new Saisiemod();
        System.out.println("dans saisie mod, vous avez saisi "+ sm.s);
        
        int i;
        i = 3;
        int j=8,d=9,l=-7;
        for (int k=0; k<10; k++){
            int m=5;
            int m1;
            m1 = 8+k;
            //m = m1;//
            System.out.println(m1);
            boolean b =true;
            b = (m==m1);
            System.out.println(b);
        }
        char c = 'a';
        //c ="b"; //impossible car on ne peut pas convertir un type char en type string
        short s1 =10;
        i = s1; //on peut stocker une variable plus petite dans une de précision plus grande, par contre l'inverse donne un message d'erreur. 
        //Pour cela on doit faire un CAST (une conversion de type)
        s1 = (short)i; //ainsi on accepte que s1 stocke une variable de def plus grande 
        final float pi= (float)3.14; //attention automatiquement un réel est considéré comme un type double. 
        float pi2 = 3.14f; //seconde facon de faire une conversion de double à float
        final float pi3; // ici on déclare la variable pi3 comme constante (finale) donc non changeable
        pi3 = 3.14f;
        i=(int)pi2; //CAST explicite pour dire que i est bien une conversion de pi2 en int (plus petite etendue de déf
        //Personne p1 = new Personne();
        System.out.println(Personne.nb);
    }
    
    void m1 (int p){
        int i;
        //System.out.println(i);
        i = p;
        System.out.println(i); //sout -> macro pour donner le system.out.print en abrégé;
    }
    
}
class Personne {
        public String nom ;
        private int pr1;
        protected int pr2;
        static public float f; // la variable static est toujours vivante
        static public int nb;
        Personne(){ 
            nb++;
        }
    }