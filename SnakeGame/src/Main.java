import java.awt.Color;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B Kenjiro Lehot
 */
public class Main {
    public static void main(String[] args){
        JFrame obj = new JFrame();
        Gameplay gp = new Gameplay();
        
        obj.setBounds(10, 10, 905, 700);
        obj.setBackground(Color.BLACK);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setLocationRelativeTo(null);
        obj.add(gp);
        
        
    }
}
