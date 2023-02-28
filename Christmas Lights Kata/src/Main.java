import com.christmas.CountBrightness;
import com.christmas.CountTurnOnLights;
import com.christmas.TurnOnLights;

public class Main {
    public static void main(String[] args) {
        TurnOnLights turnOnLights = new CountTurnOnLights();
        TurnOnLights totalBrightCount = new CountBrightness();
        System.out.println("Part - 1 : Total Light Count");
        turnOnLights.turnOn(887, 9, 959, 629);
        turnOnLights.turnOn(454, 398, 844, 448);
        turnOnLights.turnOff(539, 243, 559, 965);
        turnOnLights.turnOff(370, 819, 676, 868);
        turnOnLights.turnOff(145, 40, 370, 997);
        turnOnLights.turnOff(301, 3, 808, 453);
        turnOnLights.turnOn(351, 678, 951, 908);
        turnOnLights.ToggleLight(720, 196, 897, 994);
        turnOnLights.ToggleLight(831, 394, 904, 860);
        System.out.println("Total lit lights: " + turnOnLights.countLights());

        System.out.println("Part - 2 : Total Brightness ");
        totalBrightCount.turnOn(0, 0, 0, 0);
        System.out.println("Total Brightness: " + totalBrightCount.countLights());

        totalBrightCount.ToggleLight(0, 0, 999, 999);
        System.out.println("Total Brightness after toggle: " + totalBrightCount.countLights());
    }
}