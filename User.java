package FinalWork;

/**
 * класс пользователя по запрашиваемым данным
 */
public class User {

    // #region Поля
    String surname; // фамилия
    String name; // имя
    String bigSurname; // отчество
    String birthday; // дата рождения
    long phoneNumber; // номер телефона
    char sex; // пол
    // #endregion

    // #region Конструктор
    public User(String surname, String name, String bigSurname, String birthday, long phoneNumber, char sex) {

        this.surname = surname;
        this.name = name;
        this.bigSurname = bigSurname;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;

    }

    // #endregion

    // #region Getters
    public String getName() {
        return name;
    }

    public String getBigSurname() {
        return bigSurname;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getSex() {
        return sex;
    }
    // #endregion


    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", 
        surname, name, bigSurname, birthday, phoneNumber, sex);
    }

}
