package academy.mindswap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Shop shop1 = new Shop();
        Shop shop2 = new Shop();

        Bear[] bears = new Bear[10];
        Bear[] bears2 = new Bear[15];

        for(int i = 0; i < bears.length; i++){
            bears[i] = shop1.createBear();
        }

        for(int i = 0; i < bears2.length; i++){
            bears2[i] = shop2.createBear();
        }

        
        System.out.println(bears.length);
        System.out.println(bears2.length);


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
