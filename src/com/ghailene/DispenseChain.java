package com.ghailene;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);

}
