/*
Написать программу, которая запросит пользователя ввести <Имя> в консоли. 

Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

 */

import java.util.Scanner;

public class SEM01_TASK1 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in, "866");
        System.out.printf("Name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hi, %s", name);
        iScanner.close();
    }
}


