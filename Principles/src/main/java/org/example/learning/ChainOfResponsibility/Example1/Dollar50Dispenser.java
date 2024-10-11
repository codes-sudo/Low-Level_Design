package org.example.learning.ChainOfResponsibility.Example1;

public class Dollar50Dispenser implements DispenceChain{

    private DispenceChain nextChain;

    @Override
    public void setNextChain(DispenceChain dispenceChain) {
        this.nextChain = dispenceChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 50) {
            int num = cur.getAmount() / 50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) this.nextChain.dispense(new Currency(remainder));
        } else {
            this.nextChain.dispense(cur);
        }
    }
}
