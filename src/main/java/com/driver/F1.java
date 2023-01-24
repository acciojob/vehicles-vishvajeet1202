package com.driver;

public class F1 extends Car {


    public F1(String name, boolean isManual) {
        super(name);
        setManual(isManual);
        //Use arbitrary values for parameters which are not mentioned

    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
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
            stop();
            setGears(1);
        }
        //for all other cases, change the gear accordingly
        else if (newSpeed>0 && newSpeed<=50) {
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(1);
        }
        else if (newSpeed>50 && newSpeed<=100) {
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(2);
        }
        else if (newSpeed>100 && newSpeed<=150) {
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(3);
        }else if (newSpeed>150 && newSpeed<=200) {
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(4);
        }else if (newSpeed>200 && newSpeed<=250) {
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(5);
        }else if (newSpeed>250) {
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(6);
        }

    }
}
