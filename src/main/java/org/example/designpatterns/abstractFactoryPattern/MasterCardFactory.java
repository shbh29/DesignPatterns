package org.example.designpatterns.abstractFactoryPattern;

public class MasterCardFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        return switch (cardType) {
            case GOLD -> new MasterCardGoldCredtiCard();
            case PLATINUM -> new MasterCardPlatinumCreditCard();
        };
    }
}
