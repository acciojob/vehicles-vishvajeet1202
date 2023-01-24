package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,0,0,0,isManual,"",0);
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            changeGear(1);
        }
        //for all other cases, change the gear accordingly

        else if(newSpeed > 0 && newSpeed < 51) {
            changeSpeed(newSpeed, getCurrentDirection());
            changeGear(1);
        }
        else if(newSpeed > 50 && newSpeed < 101)
        {
            changeSpeed(newSpeed, getCurrentDirection());
            changeGear(2);
        }else if(newSpeed > 100 && newSpeed < 151)
        {
            changeSpeed(newSpeed, getCurrentDirection());
            changeGear(3);
        }
        else if(newSpeed > 150 && newSpeed < 201)
        {
            changeSpeed(newSpeed, getCurrentDirection());
            changeGear(4);
        }
        else if(newSpeed > 200 && newSpeed < 251)
        {
            changeSpeed(newSpeed, getCurrentDirection());
            changeGear(5);
        }
        else
        {
            changeSpeed(newSpeed, getCurrentDirection());
            changeGear(6);
        }
    }
}