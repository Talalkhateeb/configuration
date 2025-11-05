
package lec3;
import java.util.Scanner;

public class Lec3 {

    public static void main(String[] args) {
      Hero hero = Hero.instance(new magicalattack());
      IAttackStrategy m = new meleeattack(true);
       IAttackStrategy r = new rangedattack(true,true);
        IAttackStrategy mc = new magicalattack();
      Scanner in = new Scanner(System.in);
        System.out.println("enter the attack style you want :\n1.melle\n2.ranged\n3.magical");
        int input=in.nextInt();
        if(input == 1){
            hero.changeattackstyle(m);
            m.attack();
            
        }
        else if(input==2){ hero.changeattackstyle(r);
        r.attack();}
        else if(input ==3){hero.changeattackstyle(mc); mc.attack();}
        else{System.out.println("invaled style");}
    }
    
}
