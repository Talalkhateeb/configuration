/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec31;

/**
 *
 * @author USER
 */
public abstract class sorttool {
    protected int a[];
    public void sortarray(int a[]){
    initialize(a);
    processingarray();
    returnarray();
    }
protected void initialize(int a[]){
this.a=a.clone();
    System.out.println("step 1 array initialize");}

  protected void processingarray(){ 
      System.out.println("step 2 processing");
      for(int i=0;i<a.length-1;i++){
          for(int j=0;j<a.length-i-1;j++){
          if(compar(a[j],a[j+1])){
         int a1=a[j];
          a[j]=a[j+1];
          a[j+1]=a1;}} 
      }
  }
  protected abstract boolean compar(int a,int b);
  protected void returnarray(){
      System.out.println("step 3 final result:");
      for( int i : a ){
          System.out.println(i);
      }
   
}
}