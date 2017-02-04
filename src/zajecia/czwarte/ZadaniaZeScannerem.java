package zajecia.czwarte;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-04.
 */
public class ZadaniaZeScannerem {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnozenie");
        System.out.println("4.Dzielenie");

        int operation = getNumberFromUser("Choose operation: ");
            if (operation < 0 || operation > 4){
                System.out.println("Wrong number");
            }else {
        int firstNumber = getNumberFromUser("Insert first number: ");
        int secondNumber = getNumberFromUser("Insert second number: ");
        if (operation == 1){
            System.out.println(firstNumber + secondNumber);
        }else if (operation == 2){
            System.out.println(firstNumber - secondNumber);
        }else if (operation == 3){
            System.out.println(firstNumber * secondNumber);
        }else if (operation == 4) {
            if (secondNumber == 0) {
                System.out.println("Nieprawidlowa liczba");
            } else {
                System.out.println(firstNumber / secondNumber);
            }
        }
        }


    }

    public static double avgOfGrades() {
        int size = getNumberFromUser("Insert number of your grades: ");

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumberFromUser("Insert " + (i + 1) + "grade: ");

        }
        double avg = Zajecia4.avgOfElements(array);
        return avg;
    }

    public static void listEvenNumberFromUser() {
        int number = getNumberFromUser();
        Zajecia4.printLessThen(number);
    }

    public static void compareThreeNumbers() {
        int a = getNumberFromUser("Insert first number");
        int b = getNumberFromUser("Insert second number");
        int c = getNumberFromUser("Insert third number");
        System.out.println("Max: " + max(a, b, c));
        System.out.println("Min: " + min(a, b, c));
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int max(int a, int b, int c) {
        int[] array = {a, b, c};
        return min(array);
    }

    public static int min(int a, int b, int c) {
        int[] array = {a, b, c};
        return max(array);
    }

    public static void listNumbersFromUser() {
        int number = getNumberFromUser();
        Zajecia4.printLessThen(number);
    }

    public static int getNumberFromUser() {
        return getNumberFromUser("Insert your number: ");
    }

    public static int getNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }


    public static void checkNumberFromUser() {
        int numberFromUser = getNumberFromUser();
        if (Zajecia4.isEven(numberFromUser)) {
            System.out.println("Your number is even");

        } else {
            System.out.println("Your number is odd");
        }
    }

    public static void scannerExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is :");
        System.out.println("Please insert your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Your last name is: ");
        System.out.println("Your name is " + name + " " + lastName);
    }

}

