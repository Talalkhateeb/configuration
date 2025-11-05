/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec31;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lec31 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        int num[]={5,7,1,88,13,12,10,25,4};
        System.out.println("if you want asc sorting write 1 else if you want desc sorting write 2");
        int in = s.nextInt();
        if(in==1){
        sorttool asc=new sortasc();
        asc.sortarray(num);}
        else if(in ==2){
        sorttool desc=new sortdesc();
        desc.sortarray(num);}
        
    }
    
}
