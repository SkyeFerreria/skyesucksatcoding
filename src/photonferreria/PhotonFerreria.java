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
public class PhotonFerreria {

    public static void main(String[] args){
        Person bro = new Person("Mark",33,1000000);
        bro.introduce();
        double bromoney = bro.getMoney();
        System.out.println(bromoney);
        bromoney = bro.getMoney();
        System.out.println(bromoney);
    }
    
    
}
