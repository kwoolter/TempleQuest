/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templequest.model;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class Map {
    
        private HashMap<Integer, Floor> listFloors;
        
        public Map() {
            
            listFloors = new HashMap<Integer, Floor>();
            
        }
        
        public void initialise() {
            
            Floor newFloor = new Floor(1, "Start");
            
            this.listFloors.put(newFloor.getID(), newFloor);
            
        }
        
        
        public void print() {
            
            for(Floor floor : this.listFloors.values()){
                
                System.out.println(floor.toString());
                
            }
        }
    
}
