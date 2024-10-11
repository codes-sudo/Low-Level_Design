package org.example.learning.Adaptar.Example1;

public class AdapterCharger implements AppleCharger{
    private AndroidCharger charger;

    public AdapterCharger(AndroidCharger androidCharger) {
        this.charger = androidCharger;
    }



    @Override
    public void chargePhone() {
        charger.chargeAndroidPhone();
        System.out.println("your phone is charging with Adapter");
    }
}
