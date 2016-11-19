/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mudarede;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class ButtonFX {
    
    public void setEnterColor(JLabel label){
        label.setForeground(Color.yellow);
    }
    
    public void setExitColor(JLabel label){
        label.setForeground(Color.decode("#CC99FF"));
    }
    
}
