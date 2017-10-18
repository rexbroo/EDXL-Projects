/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rexbrooks
 */
@WebServlet(name="ControllerServlet", 
        loadOnStartup = 1,
        urlPatterns={"/category", 
                     "/reviewMessage", 
                     "/assembleDE-CAP", 
                     "/approveDE-CAP", 
                     "/addElement", 
                     "/repeatElement", 
                     "/confirmElement",
                     "/reviewCategory",
                     "/confirmCategory",
                     "/returnToCategory", 
                     "/proceedToAssembleDE-CAP",
                     "/confirmDE",
                     "/confirmCAP",
                     "/proceedToApproveDE-CAP",
                     "/approveDE-CAPMessage",
                     "/chooseLanguage"})
public class ControllerServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String userPath = request.getServletPath();

        // if category page is requested
        if (userPath.equals("/category")) {
            // TODO: Implement category request
            
        // if returnToCategory page is called
        } else if (userPath.equals("/returnToCategory")) {
            // TODO: Implement return to category page request
            
        // if reviewCategory page is called
         } else if (userPath.equals("/reviewCategory")) {
             // TODO: Implement review category page request

        // if reviewMessage page is requested
        } else if (userPath.equals("/reviewMessage")) {
            // TODO: Implement cart page request

            userPath = "/reviewMessage";

        // if assembleDE-CAP page is requested
        } else if (userPath.equals("/assembleDE-CAP")) {
            // TODO: Implement checkout page request
            
        // if proceedToAssembleDE-CAP page is requested
        } else if (userPath.equals("/proceedToAssembleDE-CAP")) {
            // TODO: Implement proceed to assemble DE-CAP page request
            
        // if approveDE-CAP page is requested
        } else if (userPath.equals("/approveDE-CAP")) {
            // TODO: Implement approve page request
            
        // if proceedToApproveDE-CAP page is requested
        } else if (userPath.equals("/proceedToApproveDE-CAP")) {
            // TODO: Implement proceed to approve DE-CAP page request

        // if user switches language
        } else if (userPath.equals("/chooseLanguage")) {
            // TODO: Implement language request

        }

        // use RequestDispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String userPath = request.getServletPath();

        // if addElement action is called
        if (userPath.equals("/addElement")) {
            // TODO: Implement add product to cart action

        // if repeatElement action is called
        } else if (userPath.equals("/repeatElement")) {
            // TODO: Implement repeat element action
            
        // if confirmElement action is called
        } else if (userPath.equals("/confirmElement")) {
            // TODO: Implement confirm element action
            
        // if confirmCategory action is called
        } else if (userPath.equals("/confirmCategory")) {
            // TODO: Implement return to confirm category action
            
        // if confirmDE action is called
        } else if (userPath.equals("/confirmDE")) {
            // TODO: Implement confirm DE action
            
        // if confirmCAP action is called
        } else if (userPath.equals("/confirmCAP")) {
            // TODO: Implement confirm CAP action
            
        // if approveDE-CAPMessage action is called
        } else if (userPath.equals("/approveDE-CAPMessage")) {
            // TODO: Implement approve DE-CAP message action

            userPath = "/approveDE-CAPMessage";
        }

        // use RequestDispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}