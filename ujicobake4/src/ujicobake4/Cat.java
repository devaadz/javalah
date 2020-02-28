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
public class Cat extends Ujicobake4 implements Pet{
    String nama;

    public Cat() {
        this("");
    }
    public Cat(String nama) {
        super(4);
        this.nama=nama;
    }
    @Override
    public void setName(String nama) {
        this.nama=nama;
    }

    @Override
    public void play() {
        System.out.println(nama+" sedang bermain");
    }
@Override
void eat(){
    System.out.println(nama+" makan ikan ");
}

public String getName(){
    return nama;
}

}