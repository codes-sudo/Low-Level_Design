package org.example.learning.ChainOfResponsibility.Example1;

import java.util.Scanner;

public class Application {

    private DispenceChain c1;

    public  Application() {
        // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenceChain c2 = new Dollar50Dispenser();
        DispenceChain c3 = new Dollar20Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        Application atmDispenser = new Application();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
}
