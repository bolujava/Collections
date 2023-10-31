package org.example;

public class AlgoLoop {

        public static  int breakChocolate(int n, int m){
            int totalSquare = n * m;
            if (totalSquare == 0){
                return 0;
            }else{
                return totalSquare - 1;
            }
        }

        public static void main(String[] args) {

            int result = breakChocolate(5, 4);
        }
    }


