package academy.mindswap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Shop shop1 = new Shop();
        Bear[] bears = new Bear[10];

        for(int i = 0; i < bears.length; i++){
            bears[i] = shop1.createBear();
        }

        System.out.println(shop1.getNumberOfBearsCreated());

        bears[1].talk();
        bears[1].talk();
        bears[1].talk();
        bears[1].talk();
        bears[1].talk();

        System.out.println("----------");
        bears[4].talk();
        bears[4].talk();
        bears[4].talk();
        bears[4].talk();
        bears[4].talk();

        System.out.println("----------");
        bears[0].talk();
        bears[0].talk();
        bears[0].talk();
        bears[0].talk();
        bears[0].talk();

    }
}
