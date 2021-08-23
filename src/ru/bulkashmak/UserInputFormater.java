package ru.bulkashmak;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ru.bulkashmak.Main.subMain;

public class UserInputFormater {

    public void formatToArithmeticOperation(String userInput) {

        String regex = "^[0-9]+ [а-я]+ [0-9]+$";
        String errorMessage = "Неверный ввод, попробуйте еще раз...";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher =pattern.matcher(userInput);

        try {
            matcher.find();
            matcher.group();
        } catch (IllegalStateException e) {
            System.err.println(errorMessage+"\n");
            subMain();
        }

        String[] userInputArray = userInput.split(" ");
        double firstNum = Double.parseDouble(userInputArray[0]);
        double secondNum = Double.parseDouble(userInputArray[2]);

        try {
            switch (userInputArray[1]) {
                case "плюс":
                    System.out.println((int)firstNum+secondNum);
		    break;
                case "минус":
                    System.out.println((int)firstNum-secondNum);
		    break;
                case "делить":
                    System.out.println(firstNum/secondNum);
		    break;
                case "умножить":
                    System.out.println(firstNum*secondNum);
		    break;
                default:
                    System.err.println(errorMessage + "\n");
                    subMain();
            }
        } catch (ArithmeticException e) {
            System.err.println("Невозможно выполнить данное выражение, попробуйте еще раз...");
            subMain();
        }
    }
}
