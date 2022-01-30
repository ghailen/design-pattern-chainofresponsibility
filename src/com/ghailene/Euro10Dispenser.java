package com.ghailene;

public class Euro10Dispenser implements DispenseChain{
    private DispenseChain chain;


    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }


    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int number = currency.getAmount() / 10;
            int remain = currency.getAmount() % 10;
            System.out.println("Dispensing " + number + " of 10 euro");

            if (remain != 0) chain.dispense(new Currency(remain));
        }else {
            chain.dispense(currency);
        }

    }
}
