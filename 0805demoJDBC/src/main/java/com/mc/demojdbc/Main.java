/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class Main {

    static final String user = "root";
    static final String password = null;
    static final String url = "jdbc:mysql://localhost:3306/javademo?zeroDateTimeBehavior=convertToNull&serverTimezone=Europe/Paris";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Connection connexion = DriverManager.getConnection(url, user, password)) {
            Statement stmt = connexion.createStatement();
            String requete = "SELECT nom, mdp "
                    + "FROM personne "
                    + "ORDER BY nom";
            ResultSet resultat = stmt.executeQuery(requete);
            while (resultat.next()) {
                String nom = resultat.getString("nom");
                String mdp = resultat.getString("mdp");
                System.out.println(nom + " : " + mdp + " est client");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
