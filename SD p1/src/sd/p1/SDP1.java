
package sd.p1;
import java.util.ArrayList;
import java.util.List;
public class SDP1 {
interface IMovable 
      {
    void move();
      }
      
    public static class Walkingon4 implements IMovable
    {
    @Override
    public void move(){System.out.println("wolking on 4");}
    }
      public static  class Jumping implements IMovable
      {
    @Override
    public void move(){System.out.println("jumping");}
      }
      interface IFeedable
      {
          void eat();
      }
      public static  class EatBanana implements IFeedable{
      @Override
      public void eat(){System.out.println("Eating banana");}
      }
           public static class EatDryfood implements IFeedable{
      @Override
      public void eat(){System.out.println("Eating dry food");}
      }
      
public abstract static class pet{
    private String name;
    private String color;
    private int energy;
    private int age;
    private String favoriteFood;

public pet(String name, String color, int energy, int age, String favoriteFood){
this.name=name;
this.color=color;
this.energy=energy;
this.age=age;
this.favoriteFood=favoriteFood;}
public String getname(){return name;}
public abstract void move();
public abstract void eat();
public abstract void MakeSound();
public abstract void play();
}
public static class cat extends pet{
    private IMovable move;
   private IFeedable feed;
   private String type;
   public cat(String name, String color, int energy, int age, String favoriteFood,String type,IMovable move,IFeedable feed){
   super(name,color,energy,age,favoriteFood);
   this.type=type;
   this.move=move;
   this.feed=feed;
   }
   @Override
   public void move(){
       move.move();
   }
   public void eat(){
       feed.eat();
   }
  public void MakeSound(){System.out.println("Meow");}

        @Override
     
    
 public void play(){System.out.println("PURRRRRRR");}
}
 
public static class monkey extends pet{
    private IMovable move;
   private IFeedable feed;
   private String type;
   public monkey(String name, String color, int energy, int age, String favoriteFood,String type,IMovable move,IFeedable feed){
   super(name,color,energy,age,favoriteFood);
   this.type=type;
   this.move=move;
   this.feed=feed;
   }
   @Override
   public void move(){
       move.move();
   }
   public void eat(){
       feed.eat();
   }
  public void MakeSound(){System.out.println("ohohh hahaha");}

        @Override
 public void play(){System.out.println("climb tree");}
}

public static class dog extends pet{
    private IMovable move;
   private IFeedable feed;
   private String size;
   public dog(String name, String color, int energy, int age, String favoriteFood,String size,IMovable move,IFeedable feed){
   super(name,color,energy,age,favoriteFood);
   this.size=size;
   this.move=move;
   this.feed=feed;
   }
   @Override
   public void move(){
       move.move();
   }
   public void eat(){
       feed.eat();
   }
  public void MakeSound(){System.out.println("woof woof");}

        @Override
 public  void play(){System.out.println("get the stack");}
}
public static class player{
private String name;
private int age;
private String email;
private  List<pet> pets;
public player( String name,int age,String email){
this.name=name;
this.age=age;
this.email=email;
this.pets=new ArrayList<>();
}
public String getnameP(){return name;}
public boolean adopt_pet(pet p){
if(p != null ){
    pets.add(p);
    System.out.println(getnameP()+" adopt "+p.getname());
    return true;
}  else
    return false;
}
public void play_with_pet(){
if(pets.isEmpty()){
    System.out.println(getnameP()+" dont have any pet");
}
else{
    for(pet p:pets){
    System.out.println(getnameP()+" play with "+p.getname());
    p.play();
    p.move();
    }
}}

public void feed_pet(){
if(pets.isEmpty()){
    System.out.println(getnameP()+" dont have any pet");
}
else{
    for(pet p:pets){
    System.out.println(getnameP()+" feed "+p.getname());
    p.eat();
    p.MakeSound();
    }
}}
}
   
    public static void main(String[] args) {
      
        IMovable walk = new Walkingon4();
        IMovable jump = new Jumping();
        IFeedable b=new EatBanana();
        IFeedable d=new EatDryfood();
        cat c1 =new cat("krkar","black and white",100,1,"dryfood","syrian",walk,d);
         monkey m1 =new monkey("momo","brown",100,1,"banana","africa",jump,b);
          dog d1 =new dog("rocky","black",100,1,"dryfood","russian",walk,d);
        player p1=new player("tala",21,"talaalkhateeb04@gmail.com");
        
        p1.adopt_pet(c1);       
         p1.adopt_pet(m1);
           p1.feed_pet();
        p1.play_with_pet();
 }   
}
