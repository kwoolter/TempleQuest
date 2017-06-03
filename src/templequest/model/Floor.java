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
public class Floor {
    
    private int ID;
    private String sName;

    public Floor(int ID, String sName) {
        this.ID = ID;
        this.sName = sName;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return sName;
    }

    @Override
    public String toString() {
        return "Floor{" + "ID=" + ID + ", sName=" + sName + '}';
    }
    
    
    
    
    
}
