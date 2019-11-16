/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothreadnum2;

import javax.swing.JOptionPane;

/**
 *
 * @author alexander.cabello
 */
public class EsercizioThreadNum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String daDire = JOptionPane.showInputDialog("Frase da dire");
        String daDire2 = JOptionPane.showInputDialog("Seconda frase da dire");
        Say ciao=new Say(daDire);
        Say ciao2 = new Say (daDire2);
        ciao.start();
        ciao2.start();
        
    }
    
}
