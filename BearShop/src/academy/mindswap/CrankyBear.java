package academy.mindswap;

public class CrankyBear extends Bear{

    public CrankyBear(){
        super();
    }

    @Override
    public void talk(){
        if(getBattery() == 0) return;
        if(getBattery() >= 50){
            System.out.println("I love you!");
            decreaseBattery();
            return;
        }
            System.out.println("This is a very sad song :(");
            setBatteryToZero();
    }
}
