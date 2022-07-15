package academy.mindswap;

public class DrunkenBear extends Bear{

    public DrunkenBear(){
        super();
    }
    @Override
    public void talk(){
        if(((int) (Math.random() * 10) < 2) ){
            System.out.println("ZZZZZZZZ");
            return;
        }
        System.out.println("I love you!");
    }
}
