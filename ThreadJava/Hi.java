/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author cabello.alexander
 */
public class Hi extends Thread {

    String frase;

    public Hi(String cosaDire) {
        frase = cosaDire;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(frase);

        }

    }
}
