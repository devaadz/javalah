/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujicobake4;

/**
 *
 * @author Lab Informatika
 */
public abstract class Ujicobake4 {
    protected int legs;
    
    protected Ujicobake4 (int legs){
        this.legs=legs;
    }
    
    void eat(){
        
    }void walk() { 
            System.out.println("hewan ini berjalan dengan "+legs+" kaki");
    }
    
}
