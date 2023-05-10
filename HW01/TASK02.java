/**
 * 
 * 2.Вывести все простые числа от 1 до 1000
 */
package HW01;


public class TASK02 {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i%j == 0 && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.printf(" %d", i);
            }     
        }
        
    }
}
