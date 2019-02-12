package examples.aaronhoskins.com.dayoneintro;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static final String BIRD_OUTER = "Feathers";
    public static final String BIRD_DIET = "Seed";
    public static final boolean BIRD_LIMBS = true;


    public static void main(String[] args) {
        Animal animal = new Animal(BIRD_LIMBS, BIRD_OUTER, BIRD_DIET);
        Bird bird = new Bird(BIRD_LIMBS,BIRD_OUTER,BIRD_DIET,2,14);
        System.out.println(animal.toString());
        System.out.println(bird.toString());

        if(bird.isHasLimbs()) {
            //do this
        } else {
            //do That
        }

        switch (bird.getBeakLength()) {
            case 1:

                break;
            case 2:

                break;
            default:

                break;
        }

        for(int i =0 ; i < 5 ; i++) {

        }

        List<String> stringList = new ArrayList<>();

        for(String string : stringList) {
            System.out.println(string);
        }
    }
}
