/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CS4Exercise3;

import CS4Exercise2.*;

/**
 *
 * @author PHOTON
 */
public class Exercise2 {

    
    public static void main(String[] args) {
        
        HSRChar charname1 = new HSRChar("Clara","Physical",50);
        HSRChar charname2 = new HSRChar("Kafka","Lightning",81);
        HSRChar charname3 = new HSRChar("Himeko","Fire",80);
        Singer singer = new Singer("Zild",0,0);
        Song favSong = new Song("Come Inside of My Heart");
        Song newFavSong = new Song("Lunes Na Naman");
        
        singer.changeFavSong(favSong);
        singer.performForAudience(12);
        singer.changeFavSong(newFavSong);
        
    }
    
}
