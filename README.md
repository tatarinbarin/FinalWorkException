Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом в заданном порядке:

Фамилия Имя Отчество дата рождения номер телефона пол

Форматы данных:

фамилия, имя, отчество - строки
дата рождения - строка формата dd.mm.yyyy
номер телефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.

1) Приложение должно проверить введенные данные по количеству. Если количество не совпадает, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

2) Приложение должно распарсить полученную строку и выделить из них требуемые значения. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

3) Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
<Фамилия> <Имя> <Отчество> <дата _ рождения> <номер _ телефона> <пол>

4) Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
Не забудьте закрыть соединение с файлом.
При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

---

Write an application that prompts the user for the following data, separated by a space, in a given order:

Last name First name Middle name date of birth phone number gender

Data formats:

last name, first name, patronymic - lines
date of birth - format string dd.mm.yyyy
phone number - unsigned integer without formatting
gender - Latin symbol f or m.

1) The application must check the entered quantity data. If the quantity does not match, return an error code, process it and show the user a message that he entered less and more data than required.

2) The application must parse the resulting string and extract the required values from them. If the data formats do not match, you need to throw an exception appropriate to the type of problem. You can use the built-in java types and create your own. The exception must be handled correctly and a message is displayed to the user with information about what exactly is wrong.

3) If everything is entered and processed correctly, a file should be created with a name equal to the last name, the received data should be written into it in one line, like
<Last name> <First name> <Middle name> <birth_date> <telephone_number> <gender>

4) Namesakes must be recorded in the same file, on separate lines.
Don't forget to close the connection to the file.
If a problem occurs with reading/writing to a file, the exception should be handled correctly and the user should see the error stacktrace.