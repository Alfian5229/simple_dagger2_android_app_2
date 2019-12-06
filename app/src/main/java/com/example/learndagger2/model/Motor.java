package com.example.learndagger2.model;

public class Motor {

    private int rpm;

    public Motor(){
        this.rpm = 100;
    }

    int getRpm(){
        return rpm;
    }

    void accelerate(int value){
        rpm = rpm + value;
    }

    void brake(){
        rpm = 0;
    }

}
