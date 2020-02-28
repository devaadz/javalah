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
public class Fish extends Ujicobake4 implements Pet{
    String nama;

    public Fish(String nama) {
        super(4);
        this.nama=nama;
    }
    public Fish (){
        this("");
    }

    @Override
    public void setName(String nama) {
        this.nama=nama;
    }

    @Override
    public void play() {
        System.out.println("ikian sedang bermain");
    }
@Override
void eat(){
    System.out.println("ikan sedang makan cacing ");
}

public String getName(){
    return nama;
}

public void walk (){
    System.out.println("ikan tidak berjalan tapi berenang"); 
}
}