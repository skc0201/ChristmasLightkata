package com.christmas;

public class CountTurnOnLights implements TurnOnLights{

    private int lightCount[][] = new  int[1000][1000];
    public CountTurnOnLights(){
    }
    @Override
    public int countLights() {
    int totalCount = 0;
    int length = lightCount.length;
    for(int i = 0; i< length ; i++){
        for(int j = 0 ; j< length ; j++){
            if(lightCount[i][j] == 1)
            totalCount++;
        }
    }
        return totalCount;
    }

    @Override
    public void turnOn(int sRow, int sCol, int eRow, int eCol) {
        for(int i = sRow ; i<=eRow ; i++){
            for(int j= sCol ; j<=eCol ; j++){
                lightCount[i][j] = 1;
            }
        }

    }

    @Override
    public void turnOff(int sRow, int sCol, int eRow, int eCol) {
        for(int i = sRow ; i<=eRow ; i++){
            for(int j= sCol ; j<=eCol ; j++){
                lightCount[i][j]   = 0;
            }
        }
    }

    @Override
    public void ToggleLight(int sRow, int sCol, int eRow, int eCol) {
        for(int i = sRow ; i<=eRow ; i++){
            for(int j= sCol ; j<=eCol ; j++){
                if(lightCount[i][j] == 1)
                lightCount[i][j]   = 0;
                else lightCount[i][j]   = 1;
            }
        }
    }
}
