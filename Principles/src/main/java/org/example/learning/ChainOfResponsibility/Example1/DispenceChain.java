package org.example.learning.ChainOfResponsibility.Example1;

public interface DispenceChain {

    void setNextChain(DispenceChain dispenceChain);

    void dispense(Currency cur);
}
