/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RYB.Objects;

import com.RYB.Graphics.Sprite;
import com.RYB.World;

/**
 *
 * @author Ben
 */
public abstract class Enemy extends Dynamic{
    
    private String type;
    
    Enemy(float x, float y, int width, int height, World world)
    {
        super(x, y, width, height,world);
        loadEnemy();
    }
    
    private void isHit()
    {
        if(isOverlap(world.getPlayer()))
            world.resetPlayer();
    }
    
    private void loadEnemy()
    {
        sprite = new Sprite("../Assets/"+type+".png", (int) x , (int) y); 
    }
    
    public void update()
    {
        super.update();
        isHit();
    }
}



