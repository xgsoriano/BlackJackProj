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
public class numberCard extends Cards{
    
    private String cardNumber;
    
    numberCard(){
        
        super("Number Card", "Diamonds", 2, false);
        
        setCardNumber("Two of");
    }
    
    numberCard(String cardType, String cardSuit, int cardValue, boolean flag, String cardNumber){
        
        super(cardType, cardSuit, cardValue, flag);
        setCardNumber(cardNumber);
    }
    
    public void setCardNumber(String name){
        
        cardNumber = name;
    }
    
    public String getCardNumber(){
        return cardNumber;
    }
    
}
