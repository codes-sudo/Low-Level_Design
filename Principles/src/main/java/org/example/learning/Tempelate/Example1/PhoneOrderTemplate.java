package org.example.learning.Tempelate.Example1;

abstract public class PhoneOrderTemplate {

    final void createOrder() {

        // series of method invocation
        selectProduct();
        packproduct();
        makePayment();
        deliverProduct();
    }

    abstract void selectProduct();
    abstract void makePayment();

    // it will be same for every subclasses
    void packproduct() {
        System.out.println("packing the product");
    }

    abstract void deliverProduct();
}
