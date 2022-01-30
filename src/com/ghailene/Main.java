package com.ghailene;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ATMDispenserChain dispenser = new ATMDispenserChain();


        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner scanner = new Scanner(System.in);
            amount = scanner.nextInt();
            if (amount % 5 != 0) {
                System.out.println("The amount should be a multiple of 5");
                return;
            }
            dispenser.getEuro50Dispenser().dispense(new Currency(amount));
        }
    }
}
