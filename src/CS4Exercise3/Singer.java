/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS4Exercise3;

import CS4Exercise2.*;

/**
 *
 * @author PHOTON
 */
public class Singer {
    
    Singer (String name,int noOfPerformances,double earnings){
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
    }
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public void performForAudience(int noOfPpl){
    this.noOfPerformances += 1;
    this.earnings += 100 * noOfPpl;
}
    public void changeFavSong(Song newFavSong){
        this.favoriteSong=newFavSong;
    }
    
}
