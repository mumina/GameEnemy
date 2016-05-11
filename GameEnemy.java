/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenemy;
import java.util.* ;
/**
 *
 * @author User
 */
public class GameEnemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        EnemyShip theEnemy = null ;
        Scanner sc = new Scanner(System.in) ;
        
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        
        System.out.println("What type of enemy? (U/R/B)?");
        
        if(sc.hasNextLine())
        {
            String typeOfShip = sc.nextLine();            
            theEnemy = shipFactory.makeEnemyship(typeOfShip) ;
            
        }
        
        
        if(theEnemy != null)
        {
            doStuffEnemy(theEnemy);
        }
        else System.out.println("Next time enter a U,R or B.");
        
    }
    
    
    public static void doStuffEnemy(EnemyShip anEnemyShip)
    {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.EnemyShipShoots();
    }
}
