package Hrostmann.ch02;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Calendar obj = Calendar.of();
        //obj.showIt();
        Calendar obj2 = Calendar.of(1);
        //obj2.showIt();

        Integer c = Integer.valueOf("5");
        Integer d = Integer.valueOf(2);
        //System.out.print(c.toString()+" "+d.toString());
        d=obj2.swap(c,c=d);
       // System.out.print(c+" "+d);

        point p1=point.NewPoint(3,4).translate(1,3).scale(0.5);
        //System.out.print(p1.getX()+""+p1.getY());

        int[] arr = {1,2,3,4,5,6,7,8,9};
        //System.out.print(RandomNumbers.randomElement(arr));
        //System.out.print(RandomNumbers.randomElement(arr));
        //System.out.print(RandomNumbers.randomElement(arr));

        ArrayList<Integer> arr2 = new ArrayList<>(10);
        for(int i=0;i<10;i++) {
            arr2.add(i);
        }
        //System.out.print(RandomNumbers.randomElement(arr2));
        //System.out.print(RandomNumbers.randomElement(arr2));
        //System.out.print(RandomNumbers.randomElement(arr2));

        /*
        try {
            CSV.write("ch2Data.csv", "1,John,gay");
            CSV.write("ch2Data.csv", "2,Leonidas,gay");
            CSV.write("ch2Data.csv", "3,Emy,Straight");
        }
        catch(Exception ex)
        {
            System.out.println("Can't write, check the code.\n"+ex.getMessage());
        }
        try {
            CSV.read("ch2Data.csv");
        } catch (Exception ex) {
            System.out.println("Can't read, check the code.\n"+ex.getMessage());
        }
        */

        Queue fifo = new Queue();

        fifo.add("i'm gay");
        fifo.add("I work hard");
        fifo.add("play even harder");
        fifo.add("i'm into fashion");
        fifo.add("Men are my passion");

        Queue fifo2 = new Queue();
        fifo2.add("eat shit!");
        fifo2.add("or my shorts");

        Queue.Iterator iter = fifo.iterator();
        Queue.Iterator iter2 = fifo2.iterator();
        fifo.showAll(iter);
        fifo2.showAll(iter2);//но лучше showAll(), а то зачем тебе итератор гонять?


    }
}
