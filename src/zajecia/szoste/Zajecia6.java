package zajecia.szoste;

import zajecia.czwarte.ZadaniaZeScannerem;

/**
 * Created by RENT on 2017-02-07.
 */
public class Zajecia6 {
    public static void main(String[] args) {
        //int numberOfElements = sumUntil(15);
        // System.out.println("You've entered " + numberOfElements + " numbers.");
        // int numberOfElements = avgUntil(15);
        //System.out.println("Insert " + numberOfElements + " numbers");
        calculator();
    }

    public static void calculator() {
        boolean flag = true;
        while (flag) {
            System.out.println("1.Dodawanie");
            System.out.println("2.Odejmowanie");
            System.out.println("3.Mnożenie");
            System.out.println("4.Dzielenie");
            System.out.println("0 Koniec");
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Your choice");
            int firstNumber = 0;
            int secondNumber = 0;
            if (numberFromUser > 0 && numberFromUser < 5) {
                firstNumber = ZadaniaZeScannerem.getNumberFromUser("Insert first number");
                secondNumber = ZadaniaZeScannerem.getNumberFromUser("Insert second number");
            }
            switch (numberFromUser) {
                case 1:
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                    break;
                case 4:
                    if (secondNumber != 0) {
                        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                    } else {
                        System.out.println("Don't divide by 0.");
                    }
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong data");
                    break;
            }
            System.out.println();
            System.out.println();


        }
    }


    public static int avgUntil(int avg) {
        boolean flag = true;
        int sum = 0;
        int counter = 0;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            sum += numberFromUser;
            counter++;
            if ((double) sum / counter > avg) {
                flag = false;
            }
        }
        return counter;
    }


    public static int sumUntil(int sum) {
        int counter = 0;
        int tmpSum = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            counter++;
            tmpSum += numberFromUser;
            if (tmpSum > sum) {
                flag = false;
            }
        }
        return counter;
    }


}

