package zajecia.osme;

import zajecia.siodme.Zajecia7;

/**
 * Created by RENT on 2017-02-09.
 */
public class Zajecia8 {
    public static void main(String[] args) {
//        String message = switchCase("AddGGTRjjguilI");
//        System.out.println(message);
        //System.out.println(switchCaseToBuilder("akjshfTYEF"));
        //System.out.println(sumOfNumberDigits(3123321));
//        System.out.println(startsWith1("World is small", "World"));
//        System.out.println(startsWith2("World is small", "World"));
//     System.out.println(startsWith3("World is small", "World"));
        String [] strings = split1("");
    }

    public static String[] split1(String message) {
        return message.split(" ");
    }

    public static String [] split2(String message) {
        String [] strings = new String [100];
        int i = 0;
        boolean flag = true;
        int tmp = 0;
        while (flag) {
            int indexOfSpace = message.indexOf(' ', tmp);
            String substring;
            if (indexOfSpace == -1) {
                substring = message.substring(tmp);
            } else {
                substring = message.substring(tmp, indexOfSpace);
            }
            tmp = indexOfSpace + 1;
            strings[i] = substring;
            i++;
            if(indexOfSpace == -1){
                flag = false;
            }
        }
        return null;
    }


    public static boolean startsWith1(String message, String expression) {
        return message.startsWith(expression);
    }

    public static boolean startsWith2(String message, String expression) {
        return message.substring(0, expression.length()).equals(expression);
    }

    public static boolean startsWith3(String message, String expression) {
        char[] messageAsCharArray = message.toCharArray();
        char[] expressionAsCharArray = expression.toCharArray();
        boolean flag = true;
        for (int i = 0; i < expressionAsCharArray.length; i++) {
            if (messageAsCharArray[i] != expressionAsCharArray[i]) {
                flag = false;
            }
        }
        return true;
    }

    public static int sumPOfNumberDigitsWithString(int number) {
        String numberAsString = String.valueOf(number);
        return Zajecia7.sumFromString(numberAsString);
    }

    public static int sumOfNumberDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        int number = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            } else if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        return String.valueOf(charArray);
    }


    public static String switchCaseToBuilder(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char tmp = message.charAt(i);
            if (tmp > 65 && tmp <= 90) {
                stringBuilder.append((char) (tmp + 32));
            } else if (tmp >= 97 && tmp <= 122) {
                stringBuilder.append((char) (tmp - 32));
            } else {
                stringBuilder.append(tmp);
            }
        }
        return stringBuilder.toString();
    }


    public static int fibonacciNumberRec(int index) {
        if (index < 0) {
            return -1;
        }
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return fibonacciNumberRec(index - 2) + fibonacciNumberRec(index - 1);
    }

    public static int fibonacciNumber(int index) {
        int left = 0;
        int right = 1;
        int result = 0;
        for (int i = 1; i <= index; i++) {
            result = left + right;
            left = right;
            right = result;
        }
        return result;
    }

    public static long factorial(int number) {
        long tmp = 1;
        for (int i = 1; i <= number; i++) {
            tmp *= i;
        }
        return tmp;
    }

    public static long factorialRecursion(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        return number * factorialRecursion(number - 1);
    }

}
