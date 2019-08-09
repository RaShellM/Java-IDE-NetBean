/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rachelmartin.testsunitaires;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrateur
 */
public class PersonneTest {

    public PersonneTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAge method, of class Personne.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Personne instance = new Personne();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAgeViaConstructeur() {
        System.out.println("getAgeViaConstructeur");
        Personne instance = new Personne(28, "george");
        int expResult = 28;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Personne.
     */
    @Test
    public void testSetAge() throws Exception {
        System.out.println("setAge");
        int age = 13;
        Personne instance = new Personne();
        instance.setAge(age);
        int result = instance.getAge();
        assertEquals(age, result);
    }

    @Test
    public void testSetAgeNegatif() throws Exception {
        System.out.println("setAgeNegatif");
        assertThrows(Exception.class, () -> {
            int age = -100;
            Personne instance = new Personne();
            instance.setAge(age);
        });
    }

    /**
     * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Personne instance = new Personne();
        instance.setNom("toto");

        String expResult = "toto";
        String result = instance.getNom();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetNomFromConstructor() {
        System.out.println("testGetNomFromConstructor");
        Personne instance = new Personne(30, "tata");

        String expResult = "tata";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNom method, of class Personne.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "George";
        Personne instance = new Personne();
        instance.setNom(nom);

        String result = instance.getNom();
        assertEquals(nom, result);
    }

    @Test
    public void testSetNomparConstructeur() {
        System.out.println("setNom");
        String nom = "George";
        Personne instance = new Personne(5, "nadia");

        String result = instance.getNom();
        assertEquals(nom, result);
    }

}
