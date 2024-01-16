package org.example.designpatterns.abstractFactoryPattern;

public class CreateCreditCard {
    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(500);

        CreditCard card  = creditCardFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        creditCardFactory =  CreditCardFactory.getCreditCardFactory(775);

        card = creditCardFactory.getCreditCard(CardType.GOLD);

        System.out.println(card.getClass());
    }
}
