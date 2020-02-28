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
public class Main {
    public static void main(String[] args) {
         Fish f = new Fish();
         Cat c = new Cat("fluffly");
         Ujicobake4 a = new Fish();
         Ujicobake4 b = new Spider();
         
         f.play();
         c.play();
         
         a.eat();
         b.eat();
         
         a.walk();
        
    }
}
