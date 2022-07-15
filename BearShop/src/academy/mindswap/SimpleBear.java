package academy.mindswap;

public class SimpleBear extends Bear{

    public SimpleBear(){
        super();
    }

    @Override
    public void talk(){
        if(getBattery() > 0){
            System.out.println("I love you!");
            decreaseBattery();
        }
    }
}
