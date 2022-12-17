
package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 0, 0, 0, isManual, "", 0);
    }

    public void accelerate(int rate) {
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        newSpeed = this.getCurrentSpeed() + rate;
        if (newSpeed == 0) {
            //Stop the car, set gear as 1
            changeSpeed(newSpeed, getCurrentDirection());
            changeGear(1);
        }

        //for all other cases, change the gear accordingly

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
            if (newSpeed > 0 && newSpeed < 51)
                changeGear(1);
            if (newSpeed > 50 && newSpeed < 101)
                changeGear(2);
            if (newSpeed > 100 && newSpeed < 151)
                changeGear(3);
            if (newSpeed > 150 && newSpeed < 201)
                changeGear(4);
            if (newSpeed > 200 && newSpeed < 251)
                changeGear(5);
            if (newSpeed > 250)
                changeGear(6);
        }
    }




}










