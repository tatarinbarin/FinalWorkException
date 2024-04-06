package FinalWork;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Создание данных структуры User
 */
public class GenerateUser {

    private static Scanner sc = new Scanner(System.in, "cp866");
    
        // #region Методы ввода
        public static String surname() { // фамилия

            System.out.println("Введите фамилию: ");
            String enterSurname = sc.nextLine();

            if(!enterSurname.isEmpty()) {
                for (int i = 0; i < enterSurname.length(); i++) {
                    if (Character.isDigit(enterSurname.charAt(i))) {
                        throw new NoValidEnterElemException("Некорректный ввод данных!");
                    }
                }
                
            }

            return enterSurname;

        }
    
        public static String name() { // имя
    
            System.out.println("Введите имя: ");
            String enterName = sc.nextLine();
            if(!enterName.isEmpty()) {
                for (int i = 0; i < enterName.length(); i++) {
                    if (Character.isDigit(enterName.charAt(i))) {
                        throw new NoValidEnterElemException("Некорректный ввод данных!");
                    }
                }
            }
            return enterName;

        }
    
        public static String bigSurname() { // отчество
    
            System.out.println("Введите отчество: ");
            String enterBigSurname = sc.nextLine();
            if(!enterBigSurname.isEmpty()) {
                for (int i = 0; i < enterBigSurname.length(); i++) {
                    if (Character.isDigit(enterBigSurname.charAt(i))) {
                        throw new NoValidEnterElemException("Некорректный ввод данных!");
                    }
                }
            }
            return enterBigSurname;
    
        }
    
        public static String birthday() { // дата рождения
    
            System.out.println();
            System.out.println("Формат ввода: dd;MM;yyyy");
            System.out.println("Введите дату рождения через пробел: число; месяц; год; ");
            String date_s = sc.nextLine();
            String newDate = date_s.replaceAll(" ", "");
            String result = null;
            Date date;
    
            SimpleDateFormat dt1 = new SimpleDateFormat("ddMMyyyy");
            SimpleDateFormat dt2 = new SimpleDateFormat("dd.MM.yyyy");
    
            if (newDate.length() < 8 || newDate.length() > 8) {
                throw new NoValidEnterElemException("Некорректный ввод данных!");
            } else {
                try {
                    date = dt1.parse(newDate);
                    result = dt2.format(date);
                    return result;
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
    
            return result;
    
        }
    
        public static Long phoneNumber() { // номер телефона
    
            System.out.println("Введите номер телефона: ");
            try {
                Long enterNumber = sc.nextLong();
                return enterNumber;
            } catch (Exception e) {
                throw new NoValidEnterElemException("Некорректный ввод данных!");
            }

                
        }
    
        public static char sex() { // пол
    
            System.out.println();
            System.out.println("Укажите ваш пол: ");
            System.out.println("f - женщина\nm - мужчина");
            char sex = sc.next().charAt(0);
            if (sex == 'f' || sex == 'm') {
                return sex;
            }
            else {
                throw new NoValidEnterElemException("Некорректный ввод данных!");
            }
                
        }
        // #endregion

}
