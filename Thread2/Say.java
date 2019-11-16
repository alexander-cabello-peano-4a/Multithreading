/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothreadnum2;

/**
 *
 * @author alexander.cabello
 */
 public class Say extends Thread{
    String cosaDire;
    public Say(String daDire) {
        
         cosaDire = daDire;
    }
    public void run () {
         for(int i=0; i<10;i++){
         System.out.println(cosaDire);   
        }
    }
    
    
}
