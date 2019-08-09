/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rachelmartin.serveurtomcat;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "Rachel", urlPatterns = {"/rachel"})

    public class Servlet2 extends GenericServlet{
        public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
          resp.setContentType("text/plain");
          PrintWriter out = resp.getWriter();
          out.println("ici on est dans un servlet générique");
    }
}

