/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS4Exercise3;

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
    
    private String name;
    private static int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    
    public void performForAudience(int noOfPpl){
        this.setNoOfPerformances(this.getNoOfPerformances() + 1);
        this.setEarnings(this.getEarnings() + 100 * noOfPpl);
}
    
    public void performForAudience(double noOfPpl){
        this.setNoOfPerformances(this.getNoOfPerformances() + 1);
        this.setEarnings((this.getEarnings() + 100 * noOfPpl) / 2);
}
    
    public static int totalPerformances(int tPerform){
    return noOfPerformances;
}
    public void changeFavSong(Song newFavSong){
        this.setFavoriteSong(newFavSong);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the noOfPerformances
     */
    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    /**
     * @param noOfPerformances the noOfPerformances to set
     */
    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }

    /**
     * @return the earnings
     */
    public double getEarnings() {
        return earnings;
    }

    /**
     * @param earnings the earnings to set
     */
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    /**
     * @return the favoriteSong
     */
    public Song getFavoriteSong() {
        return favoriteSong;
    }

    /**
     * @param favoriteSong the favoriteSong to set
     */
    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
    
    
    
}