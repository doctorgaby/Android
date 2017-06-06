package com.doctorgaby.numbershapes;

/**
 * Created by doctorgaby on 06/06/2017.
 */

public class Number {

        int number;
        //check if number is square using Math.floor library
        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);
            if (squareRoot == Math.floor(squareRoot)) {
                return true;
            } else {
                return false;
            }
        }
        //check if number is triangular
        public boolean isTriangular() {

            int x = 1;
            int triangularNumber = 1;
            while (triangularNumber < number) {
                x++;
                triangularNumber = triangularNumber + x;
            }
            if (triangularNumber == number) {
                return true;
            } else {
                return false;
            }

        }
    }
