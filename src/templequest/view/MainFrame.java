/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templequest.view;

import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author user
 */
public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        
        
        
        this.setTitle("Temple Quest");
        this.setSize(200,200);
        this.setPreferredSize(new Dimension(200,200));

        // Centre in the middle of the screen
        this.setLocationRelativeTo(null);
        this.pack();
    }
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
};
