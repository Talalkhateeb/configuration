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
public class meleeattack implements IAttackStrategy {
    public boolean knife;
    public meleeattack(boolean knife){
    this.knife=knife;}
    @Override
    public void attack() {
        System.out.println("this is melee attack Haaaaaaaah 🗡 ");
    }
    
}
