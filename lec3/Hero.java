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
public class Hero {
    private static Hero name;
    public IAttackStrategy Attack_style;
    private Hero(IAttackStrategy Attack_style_init){
     Attack_style=Attack_style_init;}

    public  static Hero instance(IAttackStrategy Attack_style_init){
        Attack_style_init=null;
    
        if( name == null){
       name=new Hero(Attack_style_init);
        
    }
        return name;
    }
public void changeattackstyle(IAttackStrategy new_style){
Attack_style =new_style;
    System.out.println("the attack style was changed");
}
public void attack(){
if(Attack_style == null){
    System.out.println("no attack strategy was selected");}
else Attack_style.attack();
}}
                     
