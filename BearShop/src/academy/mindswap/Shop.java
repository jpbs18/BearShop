package academy.mindswap;

public class Shop {

    private int numberOfBearsCreated = 0;

    public Bear createBear(){
        numberOfBearsCreated++;

        if(this.numberOfBearsCreated % 5 == 0){
           return new CrankyBear();
        }
        else if(this.numberOfBearsCreated % 2 == 0){
            return new SimpleBear();
        }

        return new DrunkenBear();
    }

    public int getNumberOfBearsCreated(){
        return numberOfBearsCreated;
    }
}
