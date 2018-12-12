/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcions;

import javax.swing.JOptionPane;

/**
 *
 * @author raguiarperez
 */
public class ExemploExcepcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaro las variables
        
        int numerador =0;
        int denominador =0;
        int cociente=0;
        try{
        numerador=Integer.parseInt(JOptionPane.showInputDialog(null, "escribe un numerador"));
        denominador=Integer.parseInt(JOptionPane.showInputDialog(null, "escribe un denominador"));
        cociente=numerador/denominador;
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Se han introducido caracteres no numéricos"); 
        }catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, "División entre cero");;
        }
           JOptionPane.showMessageDialog(null, cociente);
        }
}  

