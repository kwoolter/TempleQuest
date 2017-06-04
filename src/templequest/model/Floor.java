/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templequest.model;

import templequest.model.GameObject;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author user
 */
public class Floor {
    
    private int ID;
    private String sName;
    private List<GameObject> listObjects;

    public Floor(int ID, String sName) {
        this.ID = ID;
        this.sName = sName;
        this.listObjects = new ArrayList<GameObject>();
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
    
    public void addObject(GameObject newObject) {
        
        this.listObjects.add(newObject);
        this.sortObjects();
        
    }
    
    private void sortObjects() {
        
        Collections.sort(this.listObjects, new Comparator<GameObject>() {
                @Override
                public int compare(GameObject lhs, GameObject rhs) {
                    // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                    
                    int iResult = 0;
                    
                    if(lhs.getY() < rhs.getY()) {
                        iResult = -1;
                    }
                    else if(lhs.getY() > rhs.getY()) {
                        iResult = 1;
                        
                    }
                    else if(lhs.getX() < lhs.getX()) {
                        iResult = -1;
                    }
                    else if(lhs.getX() > lhs.getX()) {
                        iResult = 1;
                    }
                    
                    return iResult;
                }
            });
        
    }
    
    
    
    
    
}
