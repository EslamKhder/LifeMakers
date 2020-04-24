package HibernateFiles;

import Controller.DatabaseController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eng Eslam khder
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseController d = new DatabaseController();
        d.Connection();
    }
}
