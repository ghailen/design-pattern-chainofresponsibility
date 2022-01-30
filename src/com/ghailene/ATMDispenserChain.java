package com.ghailene;

public class ATMDispenserChain {


    private Euro50Dispenser euro50Dispenser;


    public Euro50Dispenser getEuro50Dispenser() {
        return euro50Dispenser;
    }

    public ATMDispenserChain() {
        euro50Dispenser = new Euro50Dispenser();
        Euro20Dispenser euro20Dispenser = new Euro20Dispenser();
        Euro10Dispenser euro10Dispenser = new Euro10Dispenser();
        Euro5Dispenser euro5Dispenser = new Euro5Dispenser();

        euro50Dispenser.setNextChain(euro20Dispenser);
        euro20Dispenser.setNextChain(euro10Dispenser);
        euro10Dispenser.setNextChain(euro5Dispenser);
    }

}
