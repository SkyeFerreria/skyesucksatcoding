/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photonferreria;

/**
 *
 * @author PHOTON
 */
public class Person {
    
    String name;
    int age;
    double money;
    Person(String name, int age, double money){
    this.name = name;
    this.age = age;
    this.money = money;
    }
    public void introduce(){
        System.out.println("Hi, my name is "+this.name+".");
    }
    
    public void birthday(){
        this.age++;
    }
    
    public double getMoney(){
        return this.money;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setMoney(double newMoney){
        this.money = newMoney;
    }
}
