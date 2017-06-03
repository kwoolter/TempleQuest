/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templequest.controller;

import templequest.view.MainFrame;

/**
 *
 * @author user
 */
public class Controller {
    
    private MainFrame view;
    
    public Controller() {
        
        this.view = new MainFrame();
        
    }
    
    
    public void run() {
        
        this.view.setVisible(true);
    }
    
}
