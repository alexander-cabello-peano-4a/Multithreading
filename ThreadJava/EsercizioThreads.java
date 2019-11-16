/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import javax.swing.JOptionPane;

/**
 *
 * @author cabello.alexander
 */
public class EsercizioThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Hi hi=new Hi("Hi");
        Hello hello = new Hello ("Hello");
        
       hi.start();
       hello.start();
       // hello.start();
       
    }
    
}
