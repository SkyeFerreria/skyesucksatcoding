/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS4Exercise1;

/**
 *
 * @author PHOTON
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Charname1 = "Clara";
        String ElementType1 = "Physical";
        int PullsObtained1 = 50;
        
        String Charname2 = "Kafka";
        String ElementType2 = "Lightning";
        int PullsObtained2 = 81;
        
        String Charname3 = "Himeko";
        String ElementType3 = "Fire";
        int PullsObtained3 = 80;
        
        int TotalBannerPulls = PullsObtained1 + PullsObtained3;
        boolean KafkaxHimeko = (PullsObtained2 >= PullsObtained3);
        boolean TypeComparison = (ElementType1 == ElementType2);
        
        System.out.println("Character 1\nName: " + Charname1 + "\nElement: " + ElementType1 + "\nNo. of pulls: " + PullsObtained1 + "\n\nCharacter 2\nName: " + Charname2 + "\nElement: " + ElementType2 + "\nNo. of pulls: " + PullsObtained2 + "\n\nCharacter 3\nName: " + Charname3 + "\nElement: " + ElementType3 + "\nNo. of pulls: " + PullsObtained3 + "\n\nTotal Standard Banner Pulls to get Clara and Himeko: " + TotalBannerPulls + "\nIt took more pulls to get Kafka than pulls to get Himeko: " + KafkaxHimeko + "\nClara and Kafka use the same element: " + TypeComparison);
    }
    
}
