/*
 * В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

 */

import java.time.LocalTime;
import java.util.Scanner;

public class SEM1_TASK1+ {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in, "866");
        System.out.printf("Введите Имя: ");
        String name = iScanner.nextLine();
        LocalTime myTime = LocalTime.now();
        if (myTime.getHour() >= 5 && myTime.getHour() < 12) {
            System.out.printf("Доброе утро, %s!", name);
        }
        if (myTime.getHour() >= 12 && myTime.getHour() < 15) {
            System.out.printf("Добрый день %s!", name);
        }
        if (myTime.getHour() >= 15 && myTime.getHour() < 21) {
                System.out.printf("Добрый вечер %s!", name);
        }
        if (myTime.getHour() >= 21) {
             System.out.printf("Доброй ночи %s!", name);
        }
        iScanner.close();
    }
        
}
