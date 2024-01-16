package org.example.designpatterns.abstractFactoryPattern;

public class VisaCardFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        return switch (cardType) {
            case GOLD -> new VisaGoldCredtiCard();
            case PLATINUM -> new VisaPlatinumCreditCard();
        };
    }
}
