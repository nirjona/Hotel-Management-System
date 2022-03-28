/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class OverrallException extends Exception {
    OverrallException (String var, JFrame jf){
       JOptionPane.showMessageDialog(jf, var, "Error", JOptionPane.ERROR_MESSAGE);   
    
    }
}
