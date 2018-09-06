/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.*;

/**
 *
 * @author HP-PC
 */
public class ServletOpera extends HttpServlet {
    double num1, num2=0, k=1;
    double res=0;
    
    String OPERACION, MSJ="";
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        num1=Integer.parseInt(request.getParameter("numero1"));
        num2=Integer.parseInt(request.getParameter("numero2"));
        OPERACION=request.getParameter("operacion");
        
        
        if(OPERACION.equals("+")){
            res=num1+num2;
            MSJ="";
        }
        else
        if(OPERACION.equals("-")){
            res=num1-num2;
            MSJ="";
            
        }
        else
        if(OPERACION.equals("*")){
            res=num1*num2;
            MSJ="";
        }
        else
        if(OPERACION.equals("/")){
            if((num2==0))
                MSJ="Error.";
            else
            res=num1/num2;
            MSJ="";
        }
        else
        if(OPERACION.equals("sen")){
            res=(Math.sin(Math.toRadians(num1)));
            MSJ="";

        }
        else
        if(OPERACION.equals("cos")){
             res=(Math.cos(Math.toRadians(num1)));
             MSJ="";
        }
        else
        if(OPERACION.equals("tan")){
            if(num1==90 || num2==270)
                MSJ="LA TANGENTE DE 90 O 270 SE INDETERMINA";
            else{
             res=(Math.tan(Math.toRadians(num1)));
             MSJ="";}
        }
         else
        if(OPERACION.equals("arctan")){
             res=(Math.atan(Math.toRadians(num1)));
             MSJ="";
        }
        else
        if(OPERACION.equals("arcsen")){
             res=(Math.asin(Math.toRadians(num1)));
             MSJ="";
        }
         else
        if(OPERACION.equals("arcos")){
             res=(Math.acos(Math.toRadians(num1)));
             MSJ="";
        }
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletOperaciones</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado:" +res+ "</h1>");
            out.println("<h2>" +MSJ+ "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

