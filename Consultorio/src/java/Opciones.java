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
import varios.Leedor;

/**
 *
 * @author root
 */
public class Opciones extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        
        
        Leedor leedor = new Leedor(); 
        String opcion = "0";
        
        
        if ( request.getParameter("operacion").equals("a") ) 
                opcion = "1";
        else if ( request.getParameter("operacion").equals("b") )
                opcion = "2";
        else if ( request.getParameter("operacion").equals("c") )
                opcion = "3";
        else if ( request.getParameter("operacion").equals("d") )
                opcion = "4";
        else if ( request.getParameter("operacion").equals("e") )
                opcion = "5";
        else
                opcion = "6";
        
        
        switch (opcion)  {      
            
            case "1":  
                
                leedor.leer(out, "/home/gaston/Consultorio/Consultorio/Consultorio/web/WEB-INF/out_ins_cli.html" );
  
                break;
              
            case "2":  
               
                leedor.leer(out, "/home/gaston/Consultorio/Consultorio/Consultorio/web/WEB-INF/out_ins_tur.html" );
    
                break;
             
            case "3": 
                
                leedor.leer(out, "/home/gaston/Consultorio/Consultorio/Consultorio/web/WEB-INF/out_del_cli.html" );

                break;
              
            case "4": 
                  
                leedor.leer(out, "/home/gaston/Consultorio/Consultorio/Consultorio/web/WEB-INF/out_sel_cli.html" );
                 
                break; 
                        
            case "5": 
                
                leedor.leer(out, "/home/gaston/Consultorio/Consultorio/Consultorio/web/WEB-INF/out_sel_tur.html" );
             
                break;
                
            case "6":
                
                leedor.leer(out, "/home/gaston/Consultorio/Consultorio/Consultorio/web/WEB-INF/out_sel_tur_k.html" );
       }
     }      
   }   
   

        
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**  
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
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
