package FinalWork;

import java.io.File;
import java.io.FileWriter;

/**
 * Операции с файлами
 */
public class JobWithFile {

    public static void writeFile(User user) {

        String fileName = user.getSurname().toUpperCase() + ".txt";
        File file = new File(fileName);
        try (FileWriter fw = new FileWriter(file, true)) {
            if (file.length() > 0) {
                fw.write('\n');
            }
            fw.write(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    

}
