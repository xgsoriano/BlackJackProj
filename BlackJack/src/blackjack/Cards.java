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
public abstract class Cards {
    
    protected String cardType;
    protected String cardSuit;
    protected int cardValue;
    protected boolean cardPlayed;
    
    Cards(){
     
        setCardType("Number Card");
        setCardSuitType("Diamonds");
        setCardValue(2);
        setCardPlayed(false);
    }
    
    Cards(String type, String suit, int value, boolean flag){
        
        setCardType(type);
        setCardSuitType(suit);
        setCardValue(value);
        setCardPlayed(flag);
        
    }
    
    //setters
    public void setCardType(String name){
        
        cardType = name;
    }
    
    public void setCardSuitType(String suit){
        cardSuit = suit;
    }
    
    public void setCardValue(int value){
        cardValue = value;
    }
    
    public void setCardPlayed(boolean flag){
        
        cardPlayed = flag;
    }
    
    
    //getters
    public String getCardType(){
        return cardType;
    }
    
    public String getCardSuit(){
        
        return cardSuit;
    }
    
    public int getCardValue(){
        
        return cardValue;
    }
    
    public boolean getCardPlayed(){
        
        return cardPlayed;
    }
    
}
