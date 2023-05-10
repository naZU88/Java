package HW01;

/**
 * 
 * 3. Реализовать простой калькулятор
 */

import java.util.Scanner;

public class TASK03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float first = iScanner.nextFloat();
        
        System.out.println("Введите второе число: ");
        float second = iScanner.nextFloat();
        
        System.out.println("Введите знак: ");
        String operations = iScanner.nextLine();
        iScanner.close();

        if (operations == "+") {
            System.out.println(first+second);
        } 
        else if (operations== "-"){
            System.out.println(first-second);
        }
        else if (operations == "*"){
            System.out.println(first*second);
        }
        else if (operations == "/") {
            System.out.println(first/second);
        }


    }
// static int scanNumber() {
//     Scanner scan = new Scanner(System.in);
//     int number = scan.nextInt();
//     return number;
   
// }


// static String scanOperations() {
//     Scanner scan = new Scanner(System.in);
//     String operations = scan.nextLine();
//     return operations;

// }


// static int getResult(String opr, int num1, int num2) {
//     int result = 0;
//     switch (opr) {
//         case "+":
//             result = num1 + num2;
//             break;
//         case "-":
//             result = num1 - num2;
//             break;
//         case "*":
//             result = num1 * num2;
//             break;
//         case "/":
//             result = num1 / num2;

//         default:
//             System.out.println("Введите оператор: -, +, *, /");
//             break;
//     }
//     return result;

// }

// public static void main(String[] args) {
//     System.out.println("Введите первое число: ");
//     int num1 = scanNumber();
//     System.out.println("Введите оператор: -, +, *, /");
//     String operations = scanOperations();
//     System.out.println("Введите второе число: ");
//     int num2 = scanNumber();
//     int result = getResult(operations, num1, num2);
//     System.out.printf("%d %s %d = %d", num1, operations, num2, result);

// }
}