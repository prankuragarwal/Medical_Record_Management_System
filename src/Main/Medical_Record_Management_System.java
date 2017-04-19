/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import Forms.Logo;



/**
 *
 * @author Prankur Agarwal
 */
public class Medical_Record_Management_System {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        // TODO code application logic here
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  new Logo().setVisible(true);
            }
        });
    
    }
}