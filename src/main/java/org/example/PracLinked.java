package org.example;

import java.util.LinkedList;

public class PracLinked {
    public static void main(String[] args) {
        LinkedList<String>cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("Lexus");
        cars.add("Honda");
        cars.getFirst();
        cars.addFirst("Mitsubishi");
        cars.set(3, "Hummer");
        cars.removeFirstOccurrence("Volvo");
        cars.removeFirst();

        System.out.println(cars.get(2));
    }

}
