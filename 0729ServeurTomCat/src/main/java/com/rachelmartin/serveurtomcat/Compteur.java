/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rachelmartin.serveurtomcat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */

@WebServlet(name = "Compteur", urlPatterns = {"/compteur"})

public class Compteur extends HttpServlet {
    
    int nombreAccess;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.

        try{
            File r = new File("./data/counter.dat");
            DataInputStream ds = new DataInputStream(new FileInputStream(r));
            nombreAccess = ds.readInt();
            ds.close();
        }
        catch(FileNotFoundException e){
            // Handle error
        }
        catch(IOException e){
            // This should be logged
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            nombreAccess++;
            out.println("<HTML>");
            out.println("<HEAD>");
            out.println("<TITLE>nomvre d'accès à la page</TITLE>");
            out.println("</HEAD><BODY style=\"font-size:40px ; text-align:center ; background-color: rgba(50,115,220,0.3)\">");
            out.println("La page a été accédée " + nombreAccess + "fois");
            out.println("</BODY></HTML>"); 
    }

    @Override
    public void destroy() {
        
        File r = new File("./data/counter.dat");
        try {
        DataOutputStream dout = new DataOutputStream(new FileOutputStream(r));
        dout.writeInt(nombreAccess);
        dout.close();
        }
        catch(IOException e) {
         // This should be logged
         }
        //super.destroy(); //To change body of generated methods, choose Tools | Templates.
        finally{
            super.destroy();
        }
    }  
}
