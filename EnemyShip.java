/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author Nafis Mustakin
 */
public abstract class EnemyShip 
{
    private String name; 
    private double DamageAmount; 
    
    public String getName() {return name;}
    public double getDamage() {return DamageAmount;}
    
    public void setName(String newName) {name = newName;} 
    public void setDamage(double newDamage) {DamageAmount = newDamage;}
    
    public void displayEnemyShip()
    {
        System.out.println(getName()+ " is on the screen");
    }
    
    public void followHeroShip()
    {
        System.out.println(getName()+ " is following the hero");
    }
    
    public void enemyShipShoots()
    {
        System.out.println(getName()+ " attacks and does " + getDamage() +" damage");
    }
    
    
}
