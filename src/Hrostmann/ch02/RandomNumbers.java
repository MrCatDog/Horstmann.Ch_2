package Hrostmann.ch02;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    private static Random rand = new Random();

    static int randomElement (int array[])
    {
        if(array.length==0) {
            return 0;
        }
        else {
            return array[rand.nextInt(array.length)];
        }
    }

    static int randomElement (ArrayList<Integer> arr)
    {
        if(arr.isEmpty()) {
            return 0;
        }
        else {
            return arr.get(rand.nextInt(arr.size()));
        }
    }
}
