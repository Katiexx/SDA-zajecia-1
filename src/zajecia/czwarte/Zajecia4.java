package zajecia.czwarte;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-04.
 */
public class Zajecia4 {
    public static void main(String[] args) {


        //int [] array = {1,2,3,4,5,6,7,8};
        //statistic(array);
    }



    public static void statistic (int[] array){
        System.out.println("Sum of elements is: " + sumOf(array));
        System.out.println("Number of even elements is: " + numberOfEven(array));
        System.out.println("Number of odd elements is: " + numberOfOdd(array));
        System.out.println("Product of elements is: " + productOf(array));
        System.out.println("Average of elements is: " +avgOfElements(array));
    }

    public static double avgOfElements (int [] array){
        double avgAll = (double)sumOf(array) / numberOfElements(array);
        return avgAll;
    }

    public static int sumOf (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int numberOfEven (int[] array){
        int counter = 0;
        for (int i = 0; i < array.length ; i++) {
            if (isEven(array[i])) {
                counter++;
            }
        }
        return counter;

    }
    public static boolean isEven (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int numberOfOdd (int [] array){
           return numberOfElements(array) - numberOfEven(array);
    }

    public static int productOf (int [] array){
        int product = 1;
        for (int i = 0; i < array.length ; i++) {
            product *= array[i];
        }
        return product;

    }
    public static int numberOfElements (int [] array){
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            number++;

        }
        return number;
    }




    public static void printLessThen (int number){
        for (int i = 0; i <= number; i++) {
            System.out.println(i + " ");

        }
    }

    public static void printEvenLessThen (int number){
        for (int i = 0; i <= number ; i+= 2) {

                System.out.println(i);


        }

    }
    public static int sumOfLessThen (int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;

        }
        return sum;
    }

        public static int productOfLessThen (int number) {
            int product = 1;
            for (int i = 1; i <= number; i++) {
                product *= i;

            }
            return product;
        }


      public static double celsjuszFahrenheit (double value){

          return (value * 1.8) + 32;
      }

      public static double fahrenheitToCelsjusz (int value){

          return (value - 32) / 1.8;
      }





}
