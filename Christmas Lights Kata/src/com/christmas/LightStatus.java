package com.christmas;

public interface LightStatus {
    public void turnOn(int sRow ,int sCol , int eRow , int eCol);
    public void turnOff(int sRow ,int sCol , int eRow , int eCol);
}
