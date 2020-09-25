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
public class Imprimir1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        double d= 456.6537;
//        System.out.printf("|%7.2f ", d);
//        System.out.printf("|%7.2f| ", d);
        Base b = new Derived();
        b.show();
        
    }
    
}
