/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enregistre;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrateur
 */
public class Lit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream fos = new FileInputStream("export.csv");
            Scanner sc = new Scanner(fos);
            String ligne = sc.nextLine();
            System.out.println(ligne);
            fos.close();
        } 
        catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
    
}
