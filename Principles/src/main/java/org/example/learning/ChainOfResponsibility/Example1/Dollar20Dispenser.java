package org.example.learning.ChainOfResponsibility.Example1;

public class Dollar20Dispenser implements DispenceChain {

    private DispenceChain chain;

    @Override
    public void setNextChain(DispenceChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 20){
            int num = cur.getAmount()/20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing "+num+" 20$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
}
