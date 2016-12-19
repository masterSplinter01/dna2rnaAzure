package com.dnaservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "dnaServlet")
public class dnaServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rnaChain = "";
        String dnaChain = (String) request.getParameter("dnaChain");
        dnaChain = dnaChain.toLowerCase();

        for (int i=0; i<dnaChain.length(); ++i){
            if (dnaChain.charAt(i) == 'a')
                rnaChain += 't';


            if (dnaChain.charAt(i) == 'c')
                rnaChain += 't';


            if (dnaChain.charAt(i) == 't')
                rnaChain += 'a';


            if (dnaChain.charAt(i) == 'g')
                rnaChain += 'c';


        }
        response.setContentType("text/html;charset=utf-8");;
        response.getWriter().write(rnaChain);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }

}


