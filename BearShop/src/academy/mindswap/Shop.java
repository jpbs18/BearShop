package academy.mindswap;

public class Shop {

    private int numberOfBearsCreated = 0;

    public Bear createBear(){
        numberOfBearsCreated++;

        if(this.numberOfBearsCreated % 5 == 0){
            Bear crankyBear = new CrankyBear();
            return crankyBear;
        }
        else if(this.numberOfBearsCreated % 2 == 0){
            Bear simpleBear = new SimpleBear();
            return simpleBear;
        }

        Bear drunkenBear = new DrunkenBear();
        return drunkenBear;
    }

    public int getNumberOfBearsCreated(){
        return numberOfBearsCreated;
    }
}
