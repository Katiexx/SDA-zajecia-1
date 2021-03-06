package zajecia.piate;

import zajecia.czwarte.ZadaniaZeScannerem;

import java.util.Random;

/**
 * Created by RENT on 2017-02-06.
 */
public class zajecia5 {
    public static void main(String[] args) {

        int [] orderedArray = homeWork();
        printHomework(orderedArray);

        //System.out.println(sumOfNumbersFromUser());
        //printArray(arrayOfNumbersFromUser());
//        Random random = new Random();
//        int numberOfStepsToWin = game(random.nextInt(100));
//        System.out.println("Game over");
//        System.out.println("You've won after " + numberOfStepsToWin + " step/s");
    }

    public static int[] homeWork() {
        int[] array = new int[10];
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            if (numberFromUser >= 0 && numberFromUser <= 9) {
                array[numberFromUser]++;

            } else {
                flag = false;
            }
        }
        return array;
    }

    public static void printHomework (int[] orderedArray) {
        for (int i = 0; i < orderedArray.length; i++) {
            for (int j = 0; j < orderedArray[i]; j++ ){
                System.out.print(i);
            }
        }
    }

    public static int game(int number) {
        boolean flag = true;
        int counter = 0;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            counter++;
            if (numberFromUser == number) {
                flag = false;
            } else if
                    (numberFromUser < number) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("Your number is too big.");
            }
        }
        return counter;
    }


    public static int[] arrayOfNumbersFromUser() {
        int[] tmpArray = new int[100];
        int size = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            if (numberFromUser != 0) {
                tmpArray[size] = numberFromUser;
                size++;
            } else {
                flag = false;
            }
        }
        return revriteArray(tmpArray, size);
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    public static int[] revriteArray(int[] bigArray, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = bigArray[i];

        }
        return array;
    }


    public static int sumOfNumbersFromUser() {
        int sum = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert your number: ");
            if (numberFromUser != 0) {
                sum += numberFromUser;
            } else {
                flag = false;
            }
        }
        return sum;
    }

    public static void oneMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void evenMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);

                } else {
                    System.out.print(0);
                }
            }
            System.out.println();

        }
    }

    public static void tree(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i) - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 0; j < number; j++) {
            for (int k = 0; k < number - 1; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    public static void triangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void square(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
