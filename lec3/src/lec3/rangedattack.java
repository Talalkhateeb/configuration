/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec3;

/**
 *
 * @author USER
 */
public class rangedattack implements IAttackStrategy {
    public boolean bow;
    public boolean arrow;
    public rangedattack(boolean bow,boolean arrow){
    this.bow=bow; this.arrow=arrow;}
    @Override
    public void attack() {
        System.out.println("this is ranged attack booooooh 🏹");
    }
    
    
}
