/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templequest.controller;

import templequest.view.MainFrame;
import templequest.model.Model;

/**
 *
 * @author user
 */
public class Controller {
    
    private MainFrame view;
    private Model model;
    
    public Controller() {
        
        this.model = new Model("Temple Quest");
        
        this.view = new MainFrame(this.model);
        
        
    }
    
    
    public void run() {
        
        this.view.setVisible(true);
    }
    
}
