package ru.tikhonov.java;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static String insAnswer;
    static int correctAnswers = 0;
    static int wrongAnswers = 0;

    public static void main(String[] args) {
        String[][] taskArrAnswer = {
                {"Что общего у всех элементов массива?", "Сколько параметров может принимать функция?", "Где правильно присвоено новое значение к многомерному массиву?"},
                {"1: Их названия;",       "1: Не более 3;",                  "1: a{0}{0} = 1;"},
                {"2: Их размер;",         "2: Не более 10;",                 "2: a[0, 0] = 1;"},
                {"3: Их тип данных;",     "3: Неограниченное количество;",   "3: a[0][0] = 1;"},
                {"4: Их адрес в памяти;", "4: Не более 20;",                 "4: a(0)(0) = 1;"},
                {"",                      "5: Не более 5;",                  "5: a[0 0] = 1;"}
        };
        String[] correctArrAnswer = { "3", "3", "3" };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < taskArrAnswer[0].length; i++) {
            showQuestions(taskArrAnswer);

            if (Objects.equals(getInsAnswer(sc), correctArrAnswer[i])) {
                correctAnswers+= 1;
            } else {
                wrongAnswers+= 1;
            }
        }
        System.out.println("Правильно - " + correctAnswers + ". Неправильно - " + wrongAnswers);
    }

    /**
     * Функция считывающая ответ
     * @return insAnswer ответ
     */
    private static String getInsAnswer(Scanner sc) {
        System.out.print("Введите ответ: ");
        while (!sc.hasNextInt()) {
            System.out.println("Введено не число! \nПовторите попытку");
            sc.nextLine();
        }
        return insAnswer = sc.nextLine();
    }

    /**
     * Функция печатающая вопрос и варианты ответа
     * @param taskAnswers массив с вопросом и ответами
     */
    private static void showQuestions (String[][] taskAnswers) {
        for (String[] taskAnswerKey : taskAnswers) {
            for (int k = 0; k < 1; k++) {
                String n = taskAnswerKey[k];
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}