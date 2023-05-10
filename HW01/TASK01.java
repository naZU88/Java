/**

 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 
 */

package HW01;

import java.util.Scanner;

public class TASK01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        int count = 0;
        int number = 0;
        for (int i = 0; i < n; i++) {
            number = number + count;
            count++;
        }
        System.out.println(number);
        iScanner.close();
    }
}
