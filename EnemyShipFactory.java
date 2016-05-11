/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenemy;

/**
 *
 * @author User
 */
public class EnemyShipFactory {
    
    public EnemyShip makeEnemyship(String newShipType)
    {
        EnemyShip newEnemyShip = null;
        
        if(newShipType.equals("U"))
        {
            newEnemyShip = new UFOEnemeyShip();
            return newEnemyShip ;
        }
        else if(newShipType.equals("R"))
        {
            newEnemyShip = new RocketEnemyShip();
            return newEnemyShip ;
        }
        else if(newShipType.equals("B"))
        {
            newEnemyShip = new BigUFOEnemyShip();
            return newEnemyShip ;
        }
        else return null;
        
    }
    
}
