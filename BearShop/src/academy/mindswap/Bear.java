package academy.mindswap;

public class Bear {

    private int battery = 100;

    public void talk(){

    }

    public int getBattery(){
        return battery;
    }

    public void decreaseBattery(){
        battery -= 25;
    }

    public void setBatteryToZero(){
        battery = 0;
    }
}
