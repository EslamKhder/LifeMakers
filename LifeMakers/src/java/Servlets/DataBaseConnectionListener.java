/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import HibernateFiles.HibernateUtil;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Web application lifecycle listener.
 *
 * @author Eng Eslam khder
 */
public class DataBaseConnectionListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        SessionFactory session = HibernateUtil.getSessionFactory();      
        sce.getServletContext().setAttribute("Connect", session);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
