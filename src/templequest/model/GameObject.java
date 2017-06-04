/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templequest.model;
import java.awt.Rectangle;


/**
 *
 * @author user
 */
public class GameObject {
    
    private int x, y, width, height, old_x, old_y, dx,dy;
    private boolean isSolid, isVisible;
    private String sName;

    public GameObject(String sName) {
        
        this.sName = sName;
        this.x = 0;
        this.y = 0;
        this.old_x = x;
        this.old_y = y;
        this.width = 0;
        this.height = 0;
        this.dx = 0;
        this.dy = 0;
        this.isSolid = true;
        this.isVisible = true;
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
    
    public Rectangle getRect(){
        
        return new Rectangle(this.x, this.y, this.width, this.height);
        
    }
    
    public boolean isColliding(Rectangle target) {
        
        return this.getRect().intersects(target);
    }
    
    public boolean isTouching(Rectangle target) {
        
        Rectangle rect = this.getRect();
        rect.grow(4, 4);
        
        return rect.intersects(target);
    }
    
    public void move(int dx, int dy) {
        
        this.old_x = x;
        this.old_y = y;
        
        this.x += dx;
        this.y += dy;
        
    }
    
    public void setPos(int x, int y) {
        
        this.old_x = x;
        this.old_y = y;
        
        this.x = x;
        this.y = y;
        
    }
    
    public void back() {
        this.x = this.old_x;
        this.y = this.old_y;
    }
    
    
    
}
