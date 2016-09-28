/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author edsel
 */
public class FaceCard extends Cards{
    
    private String faceType;
    
    FaceCard(){
        
        super("Face Card", "Diamonds", 2, false);
        
        setFaceType("Jack of");
    }
    
    FaceCard(String cardType, String cardSuit, int cardValue, boolean flag, String faceName){
        
        super(cardType, cardSuit, cardValue, flag);
        setFaceType(faceName);
    }
    
    public void setFaceType(String name){
        
        faceType = name;
    }
    
    public String getFaceType(){
        
        return faceType;
    }
}
