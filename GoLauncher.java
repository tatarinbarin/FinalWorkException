package FinalWork;

import java.util.Scanner;

/**
 * структура автоматического запуска
 */
public class GoLauncher {

    public static void start() {

        while (true) {
            System.out.println();
            System.out.println("Вас привествует BaseUserDate Bot!");
            System.out.println();
            System.out.println("Укажите тип операции: ");
            System.out.println();
            Scanner sc = new Scanner(System.in, "cp866");
            System.out.println("1 -> Создать/Добавить пользователя\n2 -> Выйти\n");
            String choise = sc.nextLine();

            if (choise.equals("1")) {

                User user = new User(GenerateUser.surname(), GenerateUser.name(), GenerateUser.bigSurname(), 
                GenerateUser.birthday(), GenerateUser.phoneNumber(), GenerateUser.sex());

                JobWithFile.writeFile(user);

                System.out.println();
                System.out.println(user);
                System.out.println("Данный пользователь создан и добавлен!");

            } else if (choise.equals("2")) {
                System.out.println("Работа завершена...");
                break;
            } else {
                System.out.println();
                System.out.println("Недопустимый код ввода!");
            }
        }

    }

}
