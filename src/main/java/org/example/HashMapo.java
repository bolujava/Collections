package org.example;

import com.sun.jdi.Value;

import java.util.*;

public class HashMapo {
    public static void main(String[] args) {
        HashMap<String, String >cars = new HashMap<String, String>();
        cars.put("Mitsubishi", "Asia");
        cars.put("bmw", "Europe");
        cars.put("Subaru", "South East Asia");
        System.out.println(cars);
    }
}
class AnotherEx{
    public static void main(String[] args){
        HashMap<Integer, String>product = new HashMap<Integer, String>();
        product.put(1, "cars");
        product.put(2, "maven");
        product.put(3, "55andN");
// getting the value of a particular ,key;
        System.out.println(product.get(1));
        System.out.println( product.get(2));
        //to check if there is a value of key2;
        System.out.println(product.containsKey(2));
        ///to check the sie of the hashmap;
        System.out.println(product.size());

        //to clone the hasmap list;
        System.out.println(product.clone());
        System.out.println(product.keySet());
        System.out.println(product.values());


        //print all keys and  loop
        for (int i: product.keySet()){
            System.out.println("key :" +i+ " value: " +product.get(i));
            System.out.println();
            // printing as a loop of the values
        }
        for (String i: product.values()){
            System.out.println(i);
        }


    }



    }

class Iterating {
    public static void main(String[] args) {
        ArrayList<String> game = new ArrayList<String>();
        game.add("nintendo");
        game.add("java");
        game.add("soccer");
        Iterator<String> it = game.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}


   // remove numbers less than 10 from a collection:
class Algo {
    public static int get(){
        int [] num = {1, 2, 5, 10, 23, 56};
        int countNum = 0;
        for (int i = 0; i< num.length; i++){
            if ( num [i] > 10 ){
                System.out.println(num[i]>10);
            }else{
                System.out.println(num[i]<10);
            }


        }
        return countNum;
    }

       public static void main(String[] args) {
           int count = get();
           System.out.println(get());

       }
   }

   ///

