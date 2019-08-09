/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enregistre;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrateur
 */
public class Enregistre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("export.csv");
          
            PrintStream ps = new PrintStream(fos);
            ps.println("champ1;champ2;champ3");
            ps.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
    
}
