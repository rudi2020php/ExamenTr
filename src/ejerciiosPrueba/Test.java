/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciiosPrueba;

/**
 *
 * @author rudi.dearcia
 */
public class Test implements Runnable{
    
    static Yoko pp2 = new Yoko();
        public static void main(String[] args){
            new Thread(new Test()).start();
            new Thread(new Test()).start();
        }

    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        pp2.roho(Thread.currentThread().getId());
    }
    
}
