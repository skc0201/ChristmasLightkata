package com.christmas;

public class CountBrightness implements  TurnOnLights{

    private int lightBrigtnessCount[][] = new  int[1000][1000];
    @Override
    public int countLights() {
        int totalCount = 0;
        int length = lightBrigtnessCount.length;
        for(int i = 0; i< length ; i++){
            for(int j = 0 ; j< length ; j++){
                    totalCount += lightBrigtnessCount[i][j];
            }
        }
        return totalCount;
    }

    @Override
    public void turnOn(int sRow, int sCol, int eRow, int eCol) {
        for(int i = sRow ; i<=eRow ; i++){
            for(int j= sCol ; j<=eCol ; j++){
                lightBrigtnessCount[i][j]  += 1;
            }
        }
    }

    @Override
    public void turnOff(int sRow, int sCol, int eRow, int eCol) {
        for(int i = sRow ; i<=eRow ; i++){
            for(int j= sCol ; j<=eCol ; j++){
                if(lightBrigtnessCount[i][j] > 0) {
                    lightBrigtnessCount[i][j] -= 1;
                }
            }
        }
    }

    @Override
    public void ToggleLight(int sRow, int sCol, int eRow, int eCol) {
        for(int i = sRow ; i<=eRow ; i++){
            for(int j= sCol ; j<=eCol ; j++){
                    lightBrigtnessCount[i][j]   += 2;
            }
        }
    }
}
