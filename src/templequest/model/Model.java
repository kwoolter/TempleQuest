/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templequest.model;

/**
 *
 * @author user
 */
public class Model {
    
    private String sName;
    private Map map;
    
    public Model(String sName) {
        
        this.sName = sName;
        this.map = new Map();
        
    }
    
    public void initialise() {
        
        this.map.initialise();
      
        
    }
    
    public void print() {
        
        this.map.print();
    }
    
}
