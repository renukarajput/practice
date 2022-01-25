package edu.ren.wildcard;

import java.util.ArrayList;
import java.util.List;

class GenericDemo {

    public static void processElements(List<?> elements) {

        //elements.add(null);
        for (Object animal : elements) {
            System.out.println(animal);
        }
    }

    public static void process(List<? extends Animal> elements) {
       // Animal animal = elements.get(6);
        for (Animal a : elements) {
            System.out.println(a);
        }
    }

    public static void insertElements(List<? super Animal> list) {
        list.add(new Animal());
        list.add(new Dogs());
        list.add(new Cats());

    }

    public static void main(String[] args) {
        List<Animal> listA = new ArrayList();
        List<Dogs> listB = new ArrayList();
        List<Cats> listC = new ArrayList();
        List<Object> listObject = new ArrayList();

        // listA = listB; can't do this bcoz animal is expected
        System.out.println("===");
    // unknown wildcard
        GenericDemo.processElements(listA);
        GenericDemo.processElements(listB);
        GenericDemo.processElements(listC);
        GenericDemo.processElements(listObject);

    // extends wildcard
        // GenericDemo.process(listObject);  // can't do this
        GenericDemo.process(listA);
        GenericDemo.process(listB);
        GenericDemo.process(listC);


    //super wildcard
        GenericDemo.insertElements(listA);
        GenericDemo.insertElements(listObject);
    }
}