package edu.ren.multiThreading.ds;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by rrn3194 on 4/15/18.
 */
public class CopyOnWriteArrayListDemo {

        private static List<int[]> intList;

        public static void main (String[] args) {
            CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<Integer>();
            cowal.add(1);
            cowal.add(2);
            cowal.add(3);

            List<Integer> sub = cowal.subList(1, 2);

            cowal.add(4);
            cowal.get(0);
            // sub.get(0); //throws ConcurrentModificationException

            for (int i:cowal){
                System.out.println(i+"-->");
                cowal.add(100+i);
            }
            System.out.println("-------------------");

            for (int i:cowal){
                System.out.println(i+"-->");
                cowal.add(100+i);
            }
        }
}
