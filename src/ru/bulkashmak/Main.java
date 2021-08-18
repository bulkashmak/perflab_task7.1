package ru.bulkashmak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        subMain();
    }

    public static void subMain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа работает с операторами \"плюс, минус, умножить, делить\".\n" +
                "Введите арифметическое выражение: ");

        String userInput = scanner.nextLine();
        UserInputFormater formater = new UserInputFormater();
        formater.formatToArithmeticOperation(userInput);
    }
}
